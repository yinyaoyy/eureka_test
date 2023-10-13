package com.yinyao.eurekaclient1.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yinyao.eurekaclient1.config.Test;
import com.yinyao.eurekaclient1.entity.Resp;
import com.yinyao.eurekaclient1.entity.Student;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.apache.commons.lang.time.DateUtils;
import org.apache.http.HttpRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class HelloWorld {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String getStr(HttpServletRequest req){
        String url =req.getLocalAddr()+":"+req.getServerPort()+"你好世界！";

        return url;
    }

    public static void main(String[] args) {
        Map map = new HashMap();
//       String str =  "{\"192\":{\"stationId\":192,\"stationName\":\"测试新增电站12345\",\"operatorOrgCode\":\"91110108MA01KL4699\",\"stationStatus\":\"1000135\"}}";
//        Map<String,Test> map  = JSON.parseObject(str, Map.class);
//        System.out.println(map);
////            Map<Integer, StationOperateCacheEntity> map = (Map<Integer, StationOperateCacheEntity>) stationOperatorCacheInfo.getData();
//        for (String integer : map.keySet()) {
//            System.out.println(map.get(integer));
//        }
//
//        System.out.println(map.get("192"));
//        System.out.println(test);
    }
    @GetMapping("/getStr1")
    String getStr1(@RequestParam String orgCode){
        System.out.println(orgCode);
        return  "hahahahahaahahah";
    }

    @GetMapping("/testFeignParam")
    String testFeignParam(@RequestParam List<Integer> asList){
        return JSON.toJSONString(asList);
    }
    @GetMapping("/testJsonConvert")
    Resp testJsonConvert(){
        Resp resp = new Resp();
        resp.setCode(200);
        resp.setDesc("成功");
        List<Student> list = Arrays.asList(new Student("yinyao",20),new Student("徐跃",18));
        resp.setData(list);
        return resp;
    }
}
