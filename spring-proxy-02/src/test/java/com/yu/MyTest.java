package com.yu;

import com.yu.demo2.UserServiceImpl;
import com.yu.demo2.UserServiceProxy;

public class MyTest {
    public static void main(String[] args) {
        UserServiceImpl service=new UserServiceImpl();
        UserServiceProxy proxy=new UserServiceProxy();
        proxy.setUserService(service);
        proxy.add();
        proxy.delete();
        proxy.select();
        proxy.update();
    }
}
