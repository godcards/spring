package com.yu.demo1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class dongtai implements InvocationHandler {

    private maifang maifang;

    public void setMaifang(com.yu.demo1.maifang maifang) {
        this.maifang = maifang;
    }

    public Object GetProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),maifang.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object resout=method.invoke(maifang,args);
        return resout;
    }
}
