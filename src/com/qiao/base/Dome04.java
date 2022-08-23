package com.qiao.base;

/**
 * @Author LiuYuQiao
 * @Data 2022/8/14 17:50
 */
public class Dome04 {
    public static void main(String[] args) {
        int i = 128;
        byte j = (byte)i;
        //内存溢出
        System.out.println(i);
        System.out.println(j);
        double a = 3.14;
        int b = (int)a;
        System.out.println(a);
        System.out.println(b);
        /**
         * 1.不能对布尔值进行转换
         * 2.不饿能把对象类型转换成不相干的类型
         * 3. 在把高容量转换到低容量的时候，强制转换
         * 4. 转换的时候可能存在内存的溢出，或者精度问题
         */
        System.out.println("=================================================");
        char c = 'a';
        int d = c + 1;
        System.out.println(d);
        System.out.println((char)d);
    }
}
