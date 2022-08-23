package com.oop.demo08;

//abstract抽象类：接口
//抽象类本质是一个类需要继承 extends
//java的类是单继承，但是Java的接口可以多继承
public abstract class Action {
    //约束~有人帮我们实现
    //abstract，抽象方法，只有方法名字，没有方法的实现
    //一旦类里有抽象方法那么这个类也必须是抽象类
    public abstract void doSomething();

    //特点：
    //1.不能new这个抽象类，只能靠子类去实现它：约束
    //2.抽象类中可以写普通的方法
    //3.抽象方法必须在抽象类中
    //抽象的抽象：约束
    public void hello(){

    }

    //思考题？
    //1.抽象类既然不能new对象那么抽象类存在构造器吗？
    //2.抽象类存在的意义？答：提高开发效率
}
