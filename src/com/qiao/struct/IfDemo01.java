package com.qiao.struct;

import java.util.Scanner;

/**
 * @Author LiuYuQiao
 * @Data 2022/8/15 13:31
 */
public class IfDemo01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入内容：");
        String s = scanner.nextLine();

        //判断字符串是否相等
        if (s.equals("hello")){
        }
        System.out.println("End");
        scanner.close();
    }
}
