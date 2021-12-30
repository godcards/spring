package com.yu.demo2;

public class UserServiceProxy implements UserService{
    UserServiceImpl userService;

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    @Override
    public void add() {
        userService.add();
        log("add");
    }

    @Override
    public void update() {
        userService.update();
        log("update");
    }

    @Override
    public void delete() {
        userService.delete();
        log("delete");
    }

    @Override
    public void select() {
        userService.select();
        log("select");
    }
    public void log(String msg){
        System.out.println("用了"+msg+"操作");
    }
}
