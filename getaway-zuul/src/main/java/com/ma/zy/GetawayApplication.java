package com.ma.zy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Hello world!
 * @author zy_mayantao
 */
@SpringBootApplication
@EnableZuulProxy
public class GetawayApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(GetawayApplication.class,args);
    }
}
