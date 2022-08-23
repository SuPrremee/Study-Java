package com.qiao.struct;

/**
 * @Author LiuYuQiao
 * @Data 2022/8/16 0:56
 */
public class ForDemo02 {
    public static void main(String[] args) {
        //用for循环输出1-1000之间能够被5整除的数，并且每行输出3个
        for (int i = 1; i <= 1000; i++){
            if (i%5 == 0){
                System.out.print(i+"\t\t");
                if (i%3 == 0){
                    System.out.print("\n");
                }
            }
        }
    }
}
