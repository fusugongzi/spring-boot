package com.cafintech.web;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wzz
 * @create 2018-08-23 15:38
 **/
@RestController
@RequestMapping(value = "/test")
public class TestController {
    @RequestMapping(value = "/sender", method = {RequestMethod.POST, RequestMethod.GET})
    public String test(@RequestBody JSONObject param) {
        System.out.println(param);
        return param.toString();
    }

    @RequestMapping(value = "/hello1")
    public String hello1() {
        return "hello1";
    }
}


  