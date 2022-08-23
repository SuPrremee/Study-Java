package com.qiao.struct;

/**
 * @Author LiuYuQiao
 * @Data 2022/8/16 15:54
 */
public class ForDemo05 {
    public static void main(String[] args) {
        int[] numbers = {10,20,30,40,50};
        for (int i = 0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
        System.out.println("========================");
        //增强型for循环
        for (int x:numbers){
            System.out.println(x);
        }
    }
}
