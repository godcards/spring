package com.yu.demo3;

//实现Rent接口
public class Host implements Rent{
    @Override
    public void rent() {
        System.out.println("我要出租房子");
    }
}