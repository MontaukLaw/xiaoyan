package com.wulala.jpush.controller;

import com.wulala.jpush.config.ServiceConfig;
import com.wulala.jpush.okhttp.ApiAccess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/jiguang")
public class PushMessageController {

    @Autowired
    public ServiceConfig serviceConfig;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
        return "pushing";
    }

    @RequestMapping(value = "/apiTest", method = RequestMethod.GET)
    public String apiTest() {
        ApiAccess apiAccess = new ApiAccess(serviceConfig.getApiAddress(), serviceConfig.getAppKey(), serviceConfig.getSecret());
        String result = apiAccess.sendNotification("1a0018970a8bd8b8f11", new Date().toString());
        //return serviceConfig.getApiAddress();
        return result;
    }

}
