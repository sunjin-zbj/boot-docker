package com.sunjin.vip.bootdocker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: bhh
 * @Mail: sunjin@sudiyi.cn
 * @Date: 2019/12/13
 */
@RestController
@RefreshScope
public class ConfigurationPropertiesController {


    @Value("${config.name}")
    private String configName;

    @Autowired
    private Environment environment;



    @RequestMapping("/name")
    public String getName(){
        System.out.println(configName);
        System.out.println(environment.getProperty("name"));
        return configName;
    }
}
