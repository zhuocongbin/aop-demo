package com.cmiot.zcb.aop.service;

import org.springframework.stereotype.Service;

/**
 * Created by zhuocongbin
 * date 2018/11/22
 */
@Service
public class TestService {
    public String get(String param) {
        System.out.println(param);
        return "get success";
    }
    public String get1(String param) {
        System.out.println(param);
        return "get success";
    }
}
