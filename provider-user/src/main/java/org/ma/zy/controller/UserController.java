package org.ma.zy.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zy_mayantao
 * @version 1.0 2020/3/23
 */
@RestController
@RefreshScope
public class UserController {
    @Value("${name}")
    private String name;

    @RequestMapping("/home")
    public String home() {
        return "Hello World";
    }

    @RequestMapping("/name")
    public String getConfigName() {
        return this.name;
    }
}
