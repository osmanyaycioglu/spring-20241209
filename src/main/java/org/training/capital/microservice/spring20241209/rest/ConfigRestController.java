package org.training.capital.microservice.spring20241209.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.training.capital.microservice.spring20241209.props.MyAppConfig;

@RestController
@RequestMapping("/admin/v1/config")
@RequiredArgsConstructor
public class ConfigRestController {
    private final MyAppConfig myAppConfig;



    @GetMapping("/get/all")
    public MyAppConfig getAppConfig(){
        String appNameLoc = myAppConfig.getAppName();
        return myAppConfig;
    }
}
