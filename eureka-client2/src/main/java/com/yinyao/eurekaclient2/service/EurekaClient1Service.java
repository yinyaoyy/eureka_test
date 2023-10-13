package com.yinyao.eurekaclient2.service;

import com.yinyao.eurekaclient2.config.FeignConfiguration;
import com.yinyao.eurekaclient2.entity.Resp;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "eureka-client1",configuration = FeignConfiguration.class)
public interface EurekaClient1Service {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String getStr();
    @GetMapping("/getStr1")
    String getStr1(@RequestParam String orgCode);
    @GetMapping("/testFeignParam")
    String testFeignParam(@RequestParam List<String> asList);
    @GetMapping("/testJsonConvert")
    Resp testJsonConvert();
}
