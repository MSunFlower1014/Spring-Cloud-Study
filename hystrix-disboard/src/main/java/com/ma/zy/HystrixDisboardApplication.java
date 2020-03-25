package com.ma.zy;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * Hello world!
 * @author zy_mayantao
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDisboardApplication
{
    public static void main( String[] args )
    {
        new SpringApplicationBuilder(HystrixDisboardApplication.class).web(true).run(args);
    }

}
