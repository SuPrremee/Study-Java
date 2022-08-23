package com.qiao.array;

public class ArrayDemo01 {
    public static void main(String[] args) {
        //变量的类型 变量的名字 变量的值
        int[] nums; //定义
        int[] nums2 = new int[10];
        nums = new int[10]; //这里面可以存放10个int类型的数字
        for (int i = 1; i <=10; i++){
            nums[i-1] = i;
        }

        int sum = 0;
        //计算所有元素的和
        for (int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        System.out.println(sum);
    }
}
