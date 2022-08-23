package com.oop.demo05;
//A和B有继承关系
public class A extends B{

//    public  void test(){
//        System.out.println("A=>test()");
//    }
    //@Override 重写

    @Override//注解：有功能的注解
    public  void test() {
        //super.test();//默认调用父类
        System.out.println("A=>test()");//重写自己的方法
        //System.out.println("A=>test()");
    }
}
