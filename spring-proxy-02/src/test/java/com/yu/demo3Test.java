package com.yu;

import com.yu.demo3.*;

public class demo3Test {
    public static void main(String[] args) {
        Host host=new Host();
        dongtaidl dl=new dongtaidl();
        dl.setRent(host);
        Rent proxy = (Rent) dl.GetProxy();
        proxy.rent();
    }
}
