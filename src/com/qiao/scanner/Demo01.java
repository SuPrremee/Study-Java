package com.qiao.scanner;

import java.util.Scanner;

/**
 * @Author LiuYuQiao
 * @Data 2022/8/15 4:02
 */
public class Demo01 {
    public static void main(String[] args) {
        //创建一个扫面器的对象，用于接受键盘数据
        //使用实例变量
        //变量类型 变量名 = new Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("使用next方式接收：");

        //判断用户有没有输入字符串
        if (scanner.hasNext()){
            String str = scanner.next();
            System.out.println("输出的内容是："+str);
        }

        //凡是属于IO流的类如果不关闭会一直占用资源
        scanner.close();
    }
}
