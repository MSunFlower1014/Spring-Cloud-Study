package com.ma.zy.controller;

import com.ma.zy.service.UserFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zy_mayantao
 * @version 1.0 2020/3/23
 */
@RestController
public class UserFeignController {
    @Autowired
    private UserFeignService userFeignService;

    @RequestMapping("/home")
    public String home() {
        return userFeignService.getHello();
    }
}
