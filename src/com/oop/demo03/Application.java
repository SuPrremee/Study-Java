package com.oop.demo03;

public class Application {
    public static void main(String[] args) {
        //要使用shuot方法就需要new一个Pet对象
        Pet dog = new Pet();
        dog.name = "旺财";
        dog.age = 3;
        dog.shout();
        System.out.println(dog.name);
        System.out.println(dog.age);

        Pet cat = new Pet();

    }
}
