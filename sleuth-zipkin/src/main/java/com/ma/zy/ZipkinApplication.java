package com.ma.zy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.internal.EnableZipkinServer;

/**
 * Hello world!
 * @author zy_mayantao
 */
@SpringBootApplication
@EnableZipkinServer
public class ZipkinApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(ZipkinApplication.class,args);
    }
}
