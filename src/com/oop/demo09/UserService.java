package com.oop.demo09;

//interface 关键字 接口都需要有实现类
//抽象的思维
public interface UserService {

    //常量
    public static final int Age = 99;

    //接口中的所有定义其实都是抽象的 public
    void run(String name);
    void delete(String name);
    void update(String name);
    void query(String name);

}
