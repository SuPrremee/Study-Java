package com.qiao.struct;

/**
 * @Author LiuYuQiao
 * @Data 2022/8/16 16:00
 */
public class BreakDemo01 {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        while (i < 100){
            i++;
            System.out.println(i);
            if (i == 30){
                //break只是跳出循环
                break;
            }
        }
    }
}
