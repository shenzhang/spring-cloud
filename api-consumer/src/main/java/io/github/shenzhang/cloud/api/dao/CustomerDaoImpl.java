package io.github.shenzhang.cloud.api.dao;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

/**
 * User: Zhang Shen
 * Date: 1/10/17
 * Time: 10:45 PM.
 */
@Repository
public class CustomerDaoImpl {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(groupKey = "customer-api-group", commandKey = "get-customer", fallbackMethod = "fallback")
    public String getCustomer(String id) {
        return restTemplate.getForObject("http://localhost/customers/{id}", String.class, id);
    }

    public String fallback() {
        return "This is a fallback value";
    }
}
