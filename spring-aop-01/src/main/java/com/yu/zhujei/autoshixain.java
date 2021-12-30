package com.yu.zhujei;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class autoshixain {
    @After("execution(* com.yu.demo1.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("在方法执行之后");
    }
}
