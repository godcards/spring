package com.yu.demo2;

public class isme implements Person{
    @Override
    public void speak() {
        System.out.println("我会说话");
    }

    @Override
    public void run() {
        System.out.println("我会跑");
    }
}
