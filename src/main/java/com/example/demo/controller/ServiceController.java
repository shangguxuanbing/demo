package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author caib
 * @Package com.example.demo.controller
 * @data 2020-9-6 17:17
 * @description
 */
@Controller
public class ServiceController {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        System.out.println("hello world");
        return "hello 张三";
    }

}
