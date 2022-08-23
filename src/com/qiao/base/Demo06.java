package com.qiao.base;

/**
 * @Author LiuYuQiao
 * @Data 2022/8/15 0:20
 */
public class Demo06 {   //类名Demo06

    //类变量 static 从属于类
    static double salary = 2500;
    //属性：变量

    //实例变量是类里面方法外面,从属于对象；如果不自动初始化，这个类型的默认值 0（整数）、0.0（小数）、u0000（字符串）、false（布尔）
    //除了基本类型，其余的默认值都是null
    String name = "陶佳宝";
    int age = 25;

    //main方法
    public static void main(String[] args) {    //局部变量有效期开始

        //局部变量
        int i = 10;
        System.out.println(i);

        //使用实例变量
        //变量类型(引用数据类型) 变量名 = new Demo08;
        Demo06 demo06 = new Demo06();
        System.out.println(demo06.age);
        System.out.println(demo06.name);

        //类变量 static
        System.out.println(salary);

    }   //局部变量有效期结束

    //其他方法
    public  void add(){

    }
    /*static int allClicks = 0;   //类变量
    String str = "hello world"; //实例变量
    public void method(){
        int i = 0;  //局部变量
    }*/
}
