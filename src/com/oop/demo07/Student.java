package com.oop.demo07;

//static:在类中使用就修饰成员变量；在方法中就修饰成员方法
public class Student {
    private static int age; //静态变量 多线程
    private double score;   //非静态的变量

    public void run(){
        //非静态方法可以调用静态方法
        System.out.println("run");
        go();
    }
    public static void go(){
        System.out.println("go");
    }
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(Student.age);
        System.out.println(student.score);
        student.run();
        Student.go();
    }
}
