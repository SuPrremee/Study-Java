package com.qiao.struct;

/**
 * @Author LiuYuQiao
 * @Data 2022/8/16 1:01
 */
public class WhileDemo04 {
    public static void main(String[] args) {
        //用while循环输出1-1000之间能被5整除的数，并且每行输出3个
        int i = 0;
        while(i < 1000){
            i++;
            if(i%5 == 0){
                System.out.print(i+"\t\t");
                if (i%3 == 0){
                    System.out.print("\n");
                }
            }
        }
    }
}
