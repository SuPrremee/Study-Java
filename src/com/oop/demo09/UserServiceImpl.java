package com.oop.demo09;
//抽象类extends
// 类 可以实现接口 implements 接口
//实现接口的类就必须重写接口中的方法

//利用接口实现多继承
public class UserServiceImpl implements UserService,TimeService{
    @Override
    public void run(String name) {

    }

    @Override
    public void delete(String name) {

    }

    @Override
    public void update(String name) {

    }

    @Override
    public void query(String name) {

    }

    @Override
    public void timer() {

    }
}
