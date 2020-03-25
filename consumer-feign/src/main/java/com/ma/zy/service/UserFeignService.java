package com.ma.zy.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author zy_mayantao
 * @version 1.0 2020/3/23
 */
@FeignClient(name = "ma-spring-provider", fallback = UserFeignService.UserFeignFallBack.class)
public interface UserFeignService {

    /**
     * 通过feign调用provider
     * @return
     */
    @RequestMapping("/home")
    String getHello();

    @Component
    static class UserFeignFallBack implements UserFeignService{
        private static final Logger LOGGER = LoggerFactory.getLogger(UserFeignFallBack.class);
        /**
         * 熔断方法
         * @return
         */
        @Override
        public String getHello() {
            LOGGER.info("getHello 方法进入熔断 ");
            return "熔断方法 getHello";
        }
    }
}
