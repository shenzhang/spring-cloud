package io.github.shenzhang.cloud.api.controller;

import io.github.shenzhang.cloud.api.service.ContainerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: Zhang Shen
 * Date: 12/30/16
 * Time: 2:33 PM.
 */
@RestController
public class ProviderController {
    private static Logger LOGGER = LoggerFactory.getLogger(ProviderController.class);
    @Autowired
    private ContainerService containerService;

    @RequestMapping("/log-error")
    @ResponseStatus(reason = "Error is triggered")
    public String logError() {
        LOGGER.error("There is an error happened");
        return "";
    }
}
