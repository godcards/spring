package com.yu.demo2;

public class MyBodyImpl implements MyBody{
    private Person p;

    public void setP(Person p) {
        this.p = p;
    }


    @Override
    public void see() {
            p.see();
            p.toString();
    }
}
