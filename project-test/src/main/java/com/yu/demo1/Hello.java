package com.yu.demo1;

public class Hello {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void getName() {
        System.out.println("name");
    }

    public Hello() {
        System.out.println("Hello");
    }
}
