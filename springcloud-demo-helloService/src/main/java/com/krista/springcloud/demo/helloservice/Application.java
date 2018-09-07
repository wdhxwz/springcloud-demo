package com.krista.springcloud.demo.helloservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Auther: dw_wanghonghong
 * @Date: 2018/9/6 20:13
 * @Description:
 */
@EnableDiscoveryClient
@SpringBootApplication
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class,args);
    }
}
