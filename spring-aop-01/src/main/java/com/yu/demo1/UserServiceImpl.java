package com.yu.demo1;

public class UserServiceImpl implements UserService{
    @Override
    public void add() {
        System.out.println("执行了add");
    }

    @Override
    public void select() {
        System.out.println("执行了select");
    }

    @Override
    public void update() {
        System.out.println("执行了update");
    }

    @Override
    public void delete() {
        System.out.println("执行了delete");
    }
}
