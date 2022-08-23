package com.qiao.struct;

/**
 * @Author LiuYuQiao
 * @Data 2022/8/16 16:45
 */
public class TestDemo {
    public static void main(String[] args) {
        //打印5行三角形
        for (int i = 1; i<= 5; i++){
            for (int j = 5; j >= i; j--) {
                System.out.print("1");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            for(int j = 1; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
