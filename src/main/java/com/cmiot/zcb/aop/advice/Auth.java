package com.cmiot.zcb.aop.advice;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by zhuocongbin
 * date 2018/11/22
 */
@Aspect
@Component
public class Auth {

    @Pointcut("execution(public * com.cmiot.zcb.aop.service.TestService.get(..)) && args(request, ..)")
    public void auth(String request){}
    @Before("auth(request)")
    public void doBefore(String request) {
        System.out.println("aop, before " + " " + request);
    }

    @Pointcut("execution(public * com.cmiot.zcb.aop.service.TestService.get1(..))&&args(request, ..)")
    public void getDate(String request){}

    @After("getDate(request)")
    public void doBefore1(String request) {
        System.out.println("aop, getDate ," + " " + request);
    }
    @AfterThrowing("getDate(request)")
    public void throwException(String request) {
        System.out.println("aop, throwing");
    }
}
