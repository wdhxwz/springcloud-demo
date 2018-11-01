package com.wangdh.spring.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 服务注册中心
 *
 * @author  dw_wangdonghong
 * @date  2018/11/1 11:24
 */
@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistryApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(ServiceRegistryApp.class, args);
    }
}
