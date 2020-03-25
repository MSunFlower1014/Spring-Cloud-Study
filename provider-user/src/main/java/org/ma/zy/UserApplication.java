package org.ma.zy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;

/**
 * Hello world!
 * @author zy_mayantao
 */
@EnableDiscoveryClient
@SpringBootApplication
@Configuration
@EnableAutoConfiguration
public class UserApplication {
    public static void main( String[] args ) {
        SpringApplication.run(UserApplication.class, args);    }

}
