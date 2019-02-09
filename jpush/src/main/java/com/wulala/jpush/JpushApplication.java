package com.wulala.jpush;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class JpushApplication {

    public static void main(String[] args) {

        SpringApplication.run(JpushApplication.class, args);
    }

}

