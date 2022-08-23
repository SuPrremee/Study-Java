package com.oop.demo05;
//Person是父类
//在Java中所有的类，都默认直接或者间接继承Object

public class Person {
    //public
    //private
    //default
    //protected
//    private int money = 10_0000_0000;
//    public void say(){
//        System.out.println("说了一句话");
//    }
//
//    public int getMoney() {
//        return money;
//    }
//
//    public void setMoney(int money) {
//        this.money = money;
//    }
    protected String name = "陶家宝";
    //private的东西无法被继承
    public void print(){
        System.out.println("Person");
    }
    //无参构造器
    public Person(String name){
        System.out.println("Person无参执行了");
    }
}
