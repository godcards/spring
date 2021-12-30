package com.yu.demo2;

public class ServiceImpl implements Service{
    isme me;

    public void setMe(isme me) {
        this.me = me;
    }

    @Override
    public void getPerson() {
        me.speak();
        me.run();
    }
}
