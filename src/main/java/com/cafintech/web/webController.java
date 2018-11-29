package com.cafintech.web;

import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by 15600 on 2017/7/14.
 */
@SuppressWarnings("SpringJavaAutowiringInspection")
@Controller
@RequestMapping("/")
public class webController {

    @RequestMapping(value = "/hello")
    public String welcome(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("hello");
        return "hello";
    }
}


