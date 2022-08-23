package com.oop.demo07;

import com.oop.demo06.Person;
import com.oop.demo06.Student;
import com.oop.demo06.Student01;
import com.oop.demo06.Teacher;

public class Application {
    public static void main(String[] args){
        //类型之间的转换：父 子
        //基本类型转换
        Person student = new Student01();
        //==>float student = 1;
        //student.go();
        //student将这个对象转换为Student类型，我们就可以使用Student类型的方法了！
        Student01 student01 = (Student01) student;
        //==>int student01 = (int) student;
        student01.go();

    }
}

/*
1.父类引用指向子类的对象
2.把子类转换为父类，向上转型
3.把父类转换为子类，向下转型，强制转换
4.方便方法的调用，减少重复代码，简洁

抽象：封装，继承，多态
 */