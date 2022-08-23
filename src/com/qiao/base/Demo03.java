package com.qiao.base;

/**
 * @Author LiuYuQiao
 * @Data 2022/8/14 17:19
 */
public class Demo03 {
    public static void main(String[] args) {
        float d1 = 2323232332323f;
        float d2 = d1 + 2;
        System.out.println(d1 == d2);
        System.out.println("=================================================");
        char c1 = '\u0061';
        System.out.println(c1);
        System.out.println("=================================================");
        //对象
        String sa = new String("hello world");
        String sb = new String("hello world");
        System.out.println(sa == sb);

        String sc = ("hello world");
        String sd = ("hello world");
        System.out.println(sc == sd);
        System.out.println("=================================================");
        boolean flag = true;
        if(flag){
            System.out.println("真");
        }
    }

}
