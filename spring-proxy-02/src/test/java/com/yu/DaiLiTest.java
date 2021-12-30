package com.yu;

import com.yu.demo1.*;

public class DaiLiTest {
    public static void main(String[] args) {
        maifangImpl mf=new maifangImpl();
        dongtai dt = new dongtai();
        dt.setMaifang(mf);
        maifang proxy = (maifang) dt.GetProxy();
        proxy.rent();
    }
}
