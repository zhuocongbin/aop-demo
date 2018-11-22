package com.cmiot.zcb.aop.controller;

import com.cmiot.zcb.aop.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhuocongbin
 * date 2018/11/22
 */
@RestController
public class TestController {
    @Autowired
    private TestService testService;
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String get() {
        String result = testService.get("hello");
        testService.get1("hello world nihao");
        System.out.println(result);
        return "hello world";
    }
}
