package com.qiao.struct;

/**
 * @Author LiuYuQiao
 * @Data 2022/8/16 0:09
 */
public class DowhileDemo01 {
    //1+2+3+...+100=
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        do{
            i++;
            sum += i;
        }while(i<100);
        System.out.println(sum);
    }

}
