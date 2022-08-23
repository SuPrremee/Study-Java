package com.oop.demo10;

public class Outer {
//    private int id = 10;
//    public static void out(){
//        System.out.println("这是一个外部类的方法");
//    }
//    public class Inner{
//        public void in(){
//            System.out.println("这是一个内部类的方法");
//        }
//        public void getId(){
//            System.out.println(id);
//        }
//    }
    //局部内部类
    public void method(){
        class Inner{
            public void in(){

            }
        }
    }
}
//一个Java类中可以有多个class类，但是只能有一个public class类
//class A{
//
//}
