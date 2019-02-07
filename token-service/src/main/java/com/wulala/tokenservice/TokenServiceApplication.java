package com.wulala.tokenservice;

import com.wulala.tokenservice.utils.UserContextFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.Filter;

@SpringBootApplication
@RestController
@EnableEurekaClient
@EnableResourceServer
public class TokenServiceApplication {
    @Bean
    public Filter userContextFilter(){
        UserContextFilter userContextFilter=new UserContextFilter();
        return userContextFilter;
    }

    @RequestMapping("/")
    public String getTokenTest() {
        return "token from token service";
    }

    public static void main(String[] args) {
        SpringApplication.run(TokenServiceApplication.class, args);
    }

}

