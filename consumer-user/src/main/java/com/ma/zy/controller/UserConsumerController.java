package com.ma.zy.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author zy_mayantao
 * @version 1.0 2020/3/23
 */
@RestController
public class UserConsumerController {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserConsumerController.class);

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/home")
    @HystrixCommand(fallbackMethod = "fallBack")
    public String home() {
        return this.restTemplate.getForObject("http://ma-spring-provider/home",String.class);
    }

    public String fallBack(){
        LOGGER.info("Ribbon get Hello 进入了熔断方法");
        return "Ribbon 熔断 fallback";
    }
}
