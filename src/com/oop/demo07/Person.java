package com.oop.demo07;

public class Person {
    //匿名代码块
    {
        System.out.println("匿名代码块");
    }
    //静态代码 最早执行
    //只执行一次
    static {
        System.out.println("静态代码块");
    }
    //构造器
    public Person(){
        System.out.println("构造方法");
    }

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("++++++++++");
        Person person1 = new Person();
    }
}
