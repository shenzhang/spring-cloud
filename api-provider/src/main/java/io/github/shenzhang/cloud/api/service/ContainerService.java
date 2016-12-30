package io.github.shenzhang.cloud.api.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

/**
 * User: Zhang Shen
 * Date: 12/30/16
 * Time: 9:55 AM.
 */
@Service
public class ContainerService {
    private static Logger LOGGER = LoggerFactory.getLogger(ContainerService.class);

    public String getIp() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();

            StringBuilder sb = new StringBuilder();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterface = networkInterfaces.nextElement();
                if (!networkInterface.isLoopback() && networkInterface.isUp() && !networkInterface.isVirtual()) {

                    return networkInterface.getDisplayName();
                }

                return "Unknow";
            }
        } catch (SocketException e) {
            throw new RuntimeException(e);
        }
    }
}
