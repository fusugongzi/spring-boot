package com.cafintech.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 15600 on 2017/7/14.
 */
@RestController
public class webController {
    @RequestMapping(value="/hello")
    public String colPage() {
        System.out.println("aaaa");
        return "hello";
    }
}
