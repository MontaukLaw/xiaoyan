package com.wulala.eurekaclient;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
@RequestMapping(value = "/api/token")
public class EurekaClientApplication {

    @RequestMapping(value = "/")
    public String getSomething() {
        return "you got it";
    }

//    @Autowired
//    private EurekaClient discoveryClient;
//
//    public String serviceUrl() {
//        InstanceInfo instance = discoveryClient.getNextServerFromEureka("STORES", false);
//        return instance.getHomePageUrl();
//    }

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class, args);
    }

}

