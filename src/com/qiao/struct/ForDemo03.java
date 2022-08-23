package com.qiao.struct;

/**
 * @Author LiuYuQiao
 * @Data 2022/8/16 1:51
 */
public class ForDemo03 {
    public static void main(String[] args) {
        //用for循环打印九九乘法表
        int sum = 0;
        for(int i = 1;i < 10;i++){  //row
            for (int j = 1;j <= i;j++){ //column 列
                sum = i * j;
                System.out.print(i + "*" + j + "=" + sum + "\t");
            }
            System.out.print("\n");
        }
    }
}
