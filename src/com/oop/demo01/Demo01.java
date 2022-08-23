package com.oop.demo01;

import java.io.IOException;

//Demo类
public class Demo01 {
    //main方法
    public static void main(String[] args) {
        Demo01 demo01 = new Demo01();
        int max = demo01.max(1,2);
        System.out.println("最大值：" + max);
        System.out.println(demo01.sayHello());
    }
    /*
    修饰符 返回值类型 方法名(参数){
        //方法体
        return 返回值;
    }
     */
    public String sayHello(){
        return "hello world!";
    }
    public  int max(int a,int b){
        return a > b ? a : b;   //三元运算符
    }

    //数组下表越界： Arrayindexoutofboumds

    public void readFile(String file) throws IOException{

    }
}
