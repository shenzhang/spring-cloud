package io.github.shenzhang.cloud.api.service.hystrix;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;

/**
 * User: Zhang Shen
 * Date: 1/10/17
 * Time: 10:45 PM.
 */
@Service
public class HystrixService {
    @HystrixCommand(groupKey = "success-group", commandKey = "success-command")
    public String success() {
        return "success";
    }

    @HystrixCommand(groupKey = "fail-group", commandKey = "fail-command", fallbackMethod = "fallback")
    public String fail() {
        throw new RuntimeException("error");
    }

    public String fallback() {
        return "fallback";
    }
}
