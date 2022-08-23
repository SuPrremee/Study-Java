package com.oop.demo05;


import com.oop.demo05.A;
import com.oop.demo05.B;

public class Application {
    public static void main(String[] args) {
//         Student student = new Student();
//       //继承了父类
//       student.say();
//        System.o ut.println(student.getMoney());
//        Person person = new Person();
        //student.test("陶家宝123");
        //student.test1();

        //静态的方法和非静态的方法区别很大
        //加了static的方法：方法的调用只和左边的有关，定义的数据类型有关
        //不加static的方法，子类重写了父类的方法(重写只和非静态方法有关)
        A a = new A();
        a.test();//
        //父类的引用b指向了子类A
        B b = new A();
        b.test();
    }
}
