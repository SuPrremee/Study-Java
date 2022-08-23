package com.qiao.base;

/**
 * @Author LiuYuQiao
 * @Data 2022/8/14 21:53
 */
public class Demo05 {
    public static void main(String[] args) {
        //操作比较大的数的时候，注意溢出问题
        //JDK7新特新，数字之间可以用下划线分割
        int money = 10_0000_0000;
        int year = 20;
        int total = money * year; //-1474836480,计算的时候溢出了。
        long total2 = money * year;//默认是int，转换之前已经存在问题了
        long total3 = money * ((long)year);//先把一个数转换为long
        System.out.println(money);
        System.out.println(total);
        System.out.println(total2);
        System.out.println(total3);
    }
}
