package com.ma.zy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * Hello world!
 * @author zy_mayantao
 */
@EnableTurbine
@SpringBootApplication
public class TurbineApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(TurbineApplication.class,args);
    }

}
