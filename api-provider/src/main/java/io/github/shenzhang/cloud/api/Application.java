package io.github.shenzhang.cloud.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * User: shenzhang
 * Date: 6/3/14
 * Time: 10:56 PM
 */
@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan("io.github.shenzhang.cloud.api")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}