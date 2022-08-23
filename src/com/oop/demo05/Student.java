package com.oop.demo05;
//Student都是派生类
//可以继承父类的很多方法
//子类继承了父类就回拥有父类的全部方法
public class Student extends Person{
    private String name = "taojiabao";

    public void print(){
        System.out.println("Student");
    }
    public void test1(){
        print();//输出print()方法中的Student
        this.print();//输出输出Student类中的print()
        super.print();//输出父类中的print
    }
    //隐藏代码：吊用了父类的无参构造
    //super();调用父类的构造器，必须要在子类构造器的第一行
    public Student(){
        super("name");//调用父类的构造器，必须要在子类构造器的第一行

        System.out.println("Student无参执行了");
    }
    public void test(String name){
        System.out.println(name);//name 是String传递的参数  name是调用函数传来的name
        System.out.println(this.name);//name = taojiabao this指代当前类的name
        System.out.println(super.name);//继承父类的name
    }
}
