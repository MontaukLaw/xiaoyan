package com.wulala.qrservice.controller;

import org.springframework.mobile.device.Device;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class QRController {

    @RequestMapping("/detect-device")
    @ResponseBody
    public String detectDevice(Device device) {
        String deviceType = "unknown";
        System.out.println("platform is " + device.getDevicePlatform());
        if (device.isNormal()) {
            deviceType = "normal";
        } else if (device.isMobile()) {
            deviceType = "mobile";
        } else if (device.isTablet()) {
            deviceType = "tablet";
        }
        return "Hello " + deviceType + " browser!";
    }

    @RequestMapping("/")
    public String getRoot() {
        return "index";
    }

}
