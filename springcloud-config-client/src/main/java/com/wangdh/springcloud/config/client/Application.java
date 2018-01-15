package com.wangdh.springcloud.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@RestController
public class Application
{
    @Value("${foo}")
    private String bar;

    @RequestMapping("/")
    public String hello() {
        return "Hello " + bar + "!";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
