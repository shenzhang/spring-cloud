package io.github.shenzhang.cloud.api.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * User: Zhang Shen
 * Date: 12/30/16
 * Time: 9:55 AM.
 */
@Service
public class ContainerService {
    private static Logger LOGGER = LoggerFactory.getLogger(ContainerService.class);

    @Autowired
    private DiscoveryClient discoveryClient;

    public String getIp() {
        try {
            return InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            LOGGER.error("Get IP address error", e);
            throw new RuntimeException(e);
        }
    }
}
