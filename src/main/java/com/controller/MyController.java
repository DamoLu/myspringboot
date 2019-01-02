package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.applet.AppletContext;

@Controller
public class MyController {

    @Autowired
    ApplicationContext applicationContext;
    @GetMapping("/hi")
    @ResponseBody
    public String Hello(){
        return "Hello world";
    }

    @GetMapping("/prop")
    @ResponseBody
    public String app(){
        return applicationContext.getEnvironment().getProperty("test.user.name");
    }
}
