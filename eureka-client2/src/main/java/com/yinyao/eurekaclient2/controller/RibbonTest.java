package com.yinyao.eurekaclient2.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.yinyao.eurekaclient2.entity.Resp;
import com.yinyao.eurekaclient2.entity.Student;
import com.yinyao.eurekaclient2.service.EurekaClient1Service;
import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class RibbonTest {
    @Resource
    private RestTemplate restTemplate;
    @Resource
    private EurekaClient1Service eurekaClient1Service;
    @RequestMapping("/ribbon/test")
    public String getRibbon(){
//        ServiceInstance instance = ribbonService.loadBalance("eureka-client1");
        String url = "http://eureka-client1/hello";
        String forObject = restTemplate.getForObject(url, String.class);
        System.out.println(forObject);
        return forObject;
    }
    @RequestMapping("/feign/test")
    public String getFeign(){
//        ServiceInstance instance = ribbonService.loadBalance("eureka-client1");
        String str = eurekaClient1Service.getStr();
        String ss = "feign==>"+str;
        System.out.println("feign==>"+str);
        return ss;
    }
    @RequestMapping("/feign/testFeignParam")
    public String testFeignParam(){
//        ServiceInstance instance = ribbonService.loadBalance("eureka-client1");
        String str = eurekaClient1Service.testFeignParam(Arrays.asList("1"));
        String ss = "feign==>"+str;
        System.out.println("feign==>"+str);
        return ss;
    }
    @RequestMapping("/feign/testParam")
    public String testParam(){
//        ServiceInstance instance = ribbonService.loadBalance("eureka-client1");
        String str = eurekaClient1Service.getStr1("aaa");
        String ss = "feign==>"+str;
        System.out.println("feign==>"+str);
        return ss;
    }
    @RequestMapping("/feign/testJsonConvert")
    @ResponseBody
    public String testJsonConvert(){
//        ServiceInstance instance = ribbonService.loadBalance("eureka-client1");
        Resp resp = eurekaClient1Service.testJsonConvert();
        List<Student> data = JSON.parseArray(JSON.toJSONString(resp.getData()),Student.class);
        return JSON.toJSONString(data);
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3);
        integers.add(51);
        integers.add(52);
        integers.add(53);
        System.out.println(JSON.toJSONString(integers));
    }
}
