package com.wulala.xiaoyanapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class XiaoyanApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(XiaoyanApiApplication.class, args);
    }

}

