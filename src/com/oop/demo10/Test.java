package com.oop.demo10;

import com.oop.demo09.UserService;

public class Test {
    public static void main(String[] args) {
        //没有名字初始化类,不能实例保存到变量中
        new Apple().eat();
        new UerService(){

            @Override
            public void hello() {

            }
        };
    }
}
class Apple{
    public void eat(){
        System.out.println("1");
    }
}
interface UerService{
    void hello();
}
