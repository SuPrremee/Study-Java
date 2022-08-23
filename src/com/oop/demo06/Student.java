package com.oop.demo06;

public class Student extends Person{
    @Override
    public void run() {
        //super.run();
        System.out.println("子类重写了父类的方法");
    }

    public void eat(){
        System.out.println("这是子类的方法");
    }
}
