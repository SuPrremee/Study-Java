package com.qiao.scanner;

import java.util.Scanner;

/**
 * @Author LiuYuQiao
 * @Data 2022/8/15 4:25
 */
public class Demo03 {
    public static void main(String[] args) {
        //键盘接受数据
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入数据：");

        String str = scanner.nextLine();

        System.out.println("输出内容是："+str);

        scanner.close();
    }
}
