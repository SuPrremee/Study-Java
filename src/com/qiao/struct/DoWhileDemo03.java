package com.qiao.struct;

/**
 * @Author LiuYuQiao
 * @Data 2022/8/16 2:03
 */
public class DoWhileDemo03 {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        int sum = 0;
        do {
            i++;
            j = 1;
            do {
                sum = i * j;
                System.out.print(i + "*" + j + "=" + sum + "\t");
                j++;
            }while(j <= i);
            System.out.print("\n");
        }while(i < 9);
    }
}
