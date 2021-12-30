package com.yu.demo2;

public class PersonImpl implements Person{
    public String name;

    @Override
    public String toString() {
        return "PersonImpl{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void see() {
        System.out.println("你看见了世界");
    }
}
