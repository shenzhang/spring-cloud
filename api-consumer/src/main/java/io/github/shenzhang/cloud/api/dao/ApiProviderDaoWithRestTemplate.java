package io.github.shenzhang.cloud.api.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

/**
 * User: Zhang Shen
 * Date: 1/4/17
 * Time: 4:14 PM.
 */

@Repository
public class ApiProviderDaoWithRestTemplate {
    @Autowired
    private RestTemplate restTemplate;

    public String getInfo() {
        return restTemplate.getForObject("http://api-provider/info", String.class);
    }
}
