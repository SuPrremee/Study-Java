package com.qiao.struct;

/**
 * @Author LiuYuQiao
 * @Data 2022/8/15 23:57
 */
public class WhileDemo03 {
    public static void main(String[] args) {
        //计算1+2+3+...+100=
        int i = 0;
        int sum = 0;
        while(i<100){
            i++;
            sum+=i;
        }
        System.out.println(sum);
    }
}
