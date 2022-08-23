package com.qiao.struct;

/**
 * @Author LiuYuQiao
 * @Data 2022/8/15 23:08
 */
public class WhileDemo01 {
    public static void main(String[] args) {
        //输出1-100
        int i = 0;
        while (i < 100){
            i++;
            System.out.print(i+"\t");
            //每五个数换行
            if (i%5 == 0) {
                System.out.print("\n");
            }
        }
    }
}
