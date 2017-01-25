package io.github.shenzhang.cloud.api.controller;

import io.github.shenzhang.cloud.api.dao.ApiProviderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: Zhang Shen
 * Date: 1/3/17
 * Time: 10:07 PM.
 */
@RestController
@RequestMapping("/consul")
public class ConsulController {
    @Autowired
    private LoadBalancerClient loadBalancer;

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private ApiProviderDao apiProviderDao;

//    @Autowired
//    @LoadBalanced
//    private RestTemplate loadBalancedRestTemplate;

//    @Autowired
//    @LoadBalanced
//    private RestTemplate restTemplate;

    /**
     * 从所有服务中选择一个服务（轮询）
     */
    @RequestMapping("/discover")
    public String discover() {
        return loadBalancer.choose("api-provider").getUri().toString();
    }

    /**
     * 获取所有服务
     */
    @RequestMapping("/services")
    public Object services() {
        return discoveryClient.getInstances("api-provider");
    }

    @RequestMapping(value = "/call", produces = "application/json")
    public String call() {
        return apiProviderDao.getInfo();
    }

    @RequestMapping(value = "/call/ip", produces = "application/json")
    public String callIp() {
        return apiProviderDao.getIp();
    }

    @RequestMapping(value = "/call/error", produces = "application/json")
    public String triggerError() {
        return apiProviderDao.triggerError();
    }

//    @RequestMapping(value = "/call1", produces = "application/json")
//    public String callUsingLoadBalancedRestTemplate() {
//        return loadBalancedRestTemplate.getForObject("http://api-provider/info", String.class);
//    }
//
//    @RequestMapping(value = "/call2", produces = "application/json")
//    public String callUsingRestTemplate() {
//        return restTemplate.getForObject("http://api-provider/info", String.class);
//    }
}
