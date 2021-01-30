package com.wantocode.serviceinfo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Chen
 * @date 2021/1/30
 */
@RestController
@Slf4j
public class TestController {


    @Value("${server.port}")
    private String servicePort;


    @GetMapping("/getInfo")
    public Map<String,String>  hello(){
        Map<String,String> hello=new HashMap<>();
        hello.put("info","Hello world");
        hello.put("servicePort",servicePort);
        return  hello;
    }


}
