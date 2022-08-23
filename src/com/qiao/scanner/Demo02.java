package com.qiao.scanner;

import java.util.Scanner;

/**
 * @Author LiuYuQiao
 * @Data 2022/8/15 4:12
 */
public class Demo02 {
    public static void main(String[] args) {

        //实例化scannr对象
        Scanner scanner = new Scanner(System.in);
        System.out.println("使用nextline方式接收：");

        //判断是否还有输入
        if (scanner.hasNext()) {
            String str = scanner.nextLine();
            System.out.println("输出的类容是："+str);
        }
        scanner.close();
    }
}
