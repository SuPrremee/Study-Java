package com.qiao.struct;

/**
 * @Author LiuYuQiao
 * @Data 2022/8/16 16:07
 */
public class ContinueDemo01 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 100){
            i++;
            if (i%10 == 0){
                System.out.println();
                //continue只是跳过某一步骤
                continue;
            }
            System.out.print(i+"\t");
        }
    }
}
