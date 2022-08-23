package com.qiao.struct;

/**
 * @Author LiuYuQiao
 * @Data 2022/8/16 1:04
 */
public class WhileDemo05 {
    public static void main(String[] args) {
        //用while循环打印九九乘法表
        int i = 0;  //row 行
        int j = 0;  //column 列
        int sum = 0;

        while(i<9){
            i++;
            j = 1;
            while(j<=i){
                sum = i * j;
                System.out.print(i + "*" + j + "=" + sum + "\t");
                j++;
            }
            System.out.print("\n");
        }
    }
}
