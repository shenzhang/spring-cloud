package io.github.shenzhang.cloud.api.controller;

import io.github.shenzhang.cloud.api.service.hystrix.HystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: Zhang Shen
 * Date: 1/10/17
 * Time: 10:05 PM.
 */
@RequestMapping("/hystrix")
@RestController
public class HystrixController {
    @Autowired
    private HystrixService hystrixService;

    @RequestMapping("/success")
    public String success() {
        return hystrixService.success();
    }

    @RequestMapping("/fail")
    public String fail() {
        return hystrixService.fail();
    }
}
