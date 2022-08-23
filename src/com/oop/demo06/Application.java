package com.oop.demo06;

public class Application {
    public static void main(String[] args) {
        //一个对象的世纪类型是确定的
        //new Student();
        //new Person();
        //可以指向的引用类型就不确定了

        //student能调用的方法都是自己的或者继承父类的
        Student s1 = new Student();

        //通过父类new子类
        //Person 父类可以指向子类但是不能调用子类独有的方法
        Person s2 = new Student();
        Object s3 = new Student();

        //s2.run();//子类重写父类的方法就执行子类的方法
        //s1.run();
        //对象能执行那些方法主要看对向左边的类型和右边关系不大
        s1.eat();
        //Person 父类可以指向子类但是不能调用子类独有的方法
        //s2.eat();
        //但是强转就能执行
        ((Student)s2).eat();
    }
}
/*

        //Object -> Person -> Student
        Object object = new Student();
        System.out.println(object instanceof Student);
        System.out.println(object instanceof Person);
        System.out.println(object instanceof Object);
        System.out.println(object instanceof Teacher);
        System.out.println(object instanceof String);
        System.out.println("=========================");
        Person person = new Person();
        System.out.println(person instanceof Student);
        System.out.println(person instanceof Person);
        System.out.println(person instanceof Object);
        System.out.println(person instanceof Teacher);
        //System.out.println(person instanceof String);
        System.out.println("=========================");
        Person person1 = new Student();
        System.out.println(person1 instanceof Student);
        System.out.println(person1 instanceof Person);
        System.out.println(person1 instanceof Object);
        System.out.println(person1 instanceof Teacher);
        //System.out.println(person1 instanceof String);
        System.out.println("=========================");
        Student student = new Student();
        System.out.println(student instanceof Student);
        System.out.println(student instanceof Person);
        System.out.println(student instanceof Object);
        //System.out.println(student instanceof Teacher);
        //System.out.println(student instanceof String);
 */