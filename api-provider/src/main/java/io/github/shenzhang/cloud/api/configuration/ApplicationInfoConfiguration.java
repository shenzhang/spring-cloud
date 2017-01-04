package io.github.shenzhang.cloud.api.configuration;

import io.github.shenzhang.cloud.api.service.ContainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

/**
 * User: Zhang Shen
 * Date: 1/3/17
 * Time: 9:41 PM.
 */
@Configuration
public class ApplicationInfoConfiguration {
    @Autowired
    private ContainerService containerService;
    @Autowired
    private Environment environment;

    @Bean
    public InfoContributor extendInfo() {
        return new InfoContributor() {
            @Override
            public void contribute(Info.Builder builder) {
                builder.withDetail("id", environment.getProperty("spring.application.name") + ":" + environment.getProperty("server.port", "8080"))
                        .withDetail("ip", containerService.getIp());
            }
        };
    }
}
