package com.qiao.method;

/**
 * @Author LiuYuQiao
 * @Data 2022/8/16 19:57
 */
public class Demo02 {
    public static void main(String[] args) {
        int Max = max(1,1);
        System.out.println(Max);
        Demo02 demo02 = new Demo02();
        System.out.println(demo02.max(1,2));
    }

    //比大小
    public static int max(int num1,int num2){
        int a = 1;
        int b = 2;
        if (num1 > num2)
            return num1;
        else if (num2 > num1) {
            return num2;
        }else {
            return 0;
        }
    }

    public double max(double num1,double num2){
        int a = 1;
        int b = 2;
        if (num1 > num2)
            return num1;
        else if (num2 > num1) {
            return num2;
        }else {
            return 0;
        }
    }

}
