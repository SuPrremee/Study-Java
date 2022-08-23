package com.oop.demo02;
//学生类
//以类的方式组织代码
public class Student {
    //属性：字段
    String name;    //默认为null
    int age;        //默认为0

    //方法
    public void study(){
        //this指代当前Student类
        System.out.println(this.name + "在学习");
    }
}
/**
 * Student 测试类
 */
/*
public static void main(String[] args) {

        //类：抽象的，需要实例化
        //类实例化后会返回一个自己的对象
        //student对象就是一个Student类的具体实例
        //以对象的方式封装数据
        Student student = new Student();

        Student xiaoming = new Student();
        Student xiaohong = new Student();
        xiaoming.name = "小明";
        xiaoming.age = 3;
        xiaohong.name = "小红";
        xiaohong.age = 3;

        System.out.println(xiaoming.name);
        System.out.println(xiaoming.age);
        System.out.println(xiaohong.name);
        System.out.println(xiaohong.age);
    }
 */