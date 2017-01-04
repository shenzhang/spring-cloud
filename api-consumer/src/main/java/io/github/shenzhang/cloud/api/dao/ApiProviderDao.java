package io.github.shenzhang.cloud.api.dao;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * User: Zhang Shen
 * Date: 1/4/17
 * Time: 11:53 AM.
 */
@FeignClient("api-provider")
public interface ApiProviderDao {
    @RequestMapping(method = RequestMethod.GET, value = "/info")
    String getInfo();
}
