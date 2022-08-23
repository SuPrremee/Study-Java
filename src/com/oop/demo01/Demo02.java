package com.oop.demo01;

public class Demo02 {

    public static void main(String[] args) {
        //静态方法 static
        Student.say();
        //实例化Student类 new
        new Student().Say();
        //对象类型 对象名 = 对象值
        Student student = new Student();
        student.say();
    }

//    //static和类一起加载
//    public static void a(){
//        b();
//    }
//    //类实例化之后才存在
//    public void b(){
//
//    }
    //非静态方法
}
