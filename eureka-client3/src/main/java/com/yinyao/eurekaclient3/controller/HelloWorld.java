package com.yinyao.eurekaclient3.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class HelloWorld {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String getStr(HttpServletRequest req){
        String url =req.getLocalAddr()+":"+req.getServerPort()+"你好世界！";

        return url;
    }
}
