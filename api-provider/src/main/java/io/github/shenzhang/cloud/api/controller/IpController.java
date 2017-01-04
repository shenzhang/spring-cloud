package io.github.shenzhang.cloud.api.controller;

import io.github.shenzhang.cloud.api.service.ContainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: Zhang Shen
 * Date: 12/30/16
 * Time: 2:33 PM.
 */
@RestController
@RequestMapping("/ip")
public class IpController {
    @Autowired
    private ContainerService containerService;

    @RequestMapping
    public String getIp() {
        return containerService.getIp();
    }
}
