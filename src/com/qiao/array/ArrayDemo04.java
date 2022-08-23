package com.qiao.array;

public class ArrayDemo04 {
    //进阶
    public static void main(String[] args) {
        int[] Arrays = {1,2,3,4,5};

        //增强型循环 for-each循环
        for (int array : Arrays) {
            System.out.println(array);
        }
        System.out.println("====================");
        printArray(Arrays);
        System.out.println();
        System.out.println("====================");
        int[] reverse = reverse(Arrays);
        printArray(reverse);
//        for (int i = 0; i < reverse.length; i++){
//            System.out.println(reverse[i]);
//        }
    }
    //数组作方法入参
    //打印数组元素
    public  static void printArray(int[] arrays){
        for (int i = 0; i < arrays.length; i++){
            System.out.print(arrays[i] + " ");
        }
    }
    //数组作返回值
    public static int[] reverse(int[] arrays){
        int[] result = new int[arrays.length];
        //反转操作
        for (int i = 0 , j = result.length - 1; i < arrays.length; i++,j--){
            result[j] = arrays[i];
        }
        return result;
    }
}
