package com.wulala.xiaoyanapi;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.cloud.client.discovery.DiscoveryClient;

@ServletComponentScan
@SpringBootApplication
@EnableEurekaClient
@RestController
@EnableDiscoveryClient
@RequestMapping("/hw")
public class XiaoyanApiApplication {

    private static final Logger logger = LoggerFactory.getLogger(XiaoyanApiApplication.class);
    @Autowired
    private EurekaClient discoveryClient;

    @RequestMapping("/")
    public String getRoot(){
        return "hw!";
    }

    public String serviceUrl() {
        InstanceInfo instance = discoveryClient.getNextServerFromEureka("STORES", false);
        return instance.getHomePageUrl();
    }

    public static void main(String[] args) {
        SpringApplication.run(XiaoyanApiApplication.class, args);
    }

}

