package com.wulala.jpush.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Configuration
public class ServiceConfig {

    @Value("${jpush.appkey}")
    private String appKey = "";

    @Value("${jpush.secret}")
    private String secret="";

    @Value("${jpush.api.address}")
    private String apiAddress="";

    public String getAppKey() {
        return appKey;
    }

    public String getSecret() {
        return secret;
    }

    public String getApiAddress() {
        return apiAddress;
    }
}
