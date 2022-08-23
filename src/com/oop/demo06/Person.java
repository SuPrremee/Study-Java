package com.oop.demo06;

public class Person  {
    public void run(){
        System.out.println("run能运行是因为子类Student继承了父类Person的全部方法");
    }
}

/*
多态注意事项：
1. 多态是方法的多态，属性没有多态
2.父类和子类，有联系 如果没有联系就换有类型转换异常 ClassCastException
3.存在的条件：存在继承关系，没有继承关系就没有多态，方法需要重写，父类的引用指向子类对象 Father f1 = new Son();
 不能重写的方法：
    1.static 方法，属于类，他不属于实例
    2.final 常量
    3.private 方法
 */