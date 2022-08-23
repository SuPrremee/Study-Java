package com.qiao.array;

import java.util.Arrays;

public class ArrayDemo06 {
    public static void main(String[] args) {
        int[] array= {1,7,2,4,3,8,5,6};
        int[] Array = new int[10];
        ArrayDemo04 arrayDemo04 = new ArrayDemo04();
        for (int i = 1; i <= Array.length; i++){
            Array[i-1] = i;
        }
        //数组填充
        Arrays.fill(Array,2,4,0);
        System.out.println(array);
        //打印数组元素
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(Array));
        arrayDemo04.printArray(array);
        System.out.println();

        arrayDemo04.printArray(Array);
        System.out.println();

        printArray(array);
        System.out.println();

        printArray(Array);
        System.out.println();

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            if (i == 0){
                System.out.print("{");
            }
            if (i == array.length-1){
                System.out.print(array[i] + "}");
            }else {
                System.out.print(array[i] + ",");
            }
        }
    }
}
