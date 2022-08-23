package com.qiao.method;

/**
 * @Author LiuYuQiao
 * @Data 2022/8/16 21:55
 */
public class Demo06 {
    public static void main(String[] args) {
        //5!=5*4*3*2*1=120
        double sum = f(5);
        System.out.println(5 +"!= " + sum);

    }
    //5!=5*4*3*2*1=120
    public static double f(double n){
        if (n == 1)
            return 1;
        else
        return n * f(n-1);
    }
}
