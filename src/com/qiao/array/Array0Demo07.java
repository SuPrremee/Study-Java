package com.qiao.array;


public class Array0Demo07 {
    public static void main(String[] args) {
        int[] array= {8,7,6,5,4,3,2,1};
        System.out.println(array.length);
        System.out.println("排序前==============");
        printArray(array);
        System.out.println("\n"+"排序后==============");
        Bubblesort(array);
        printArray(array);
        System.out.println("\n"+"优化排序后==============");
        Bubblesort1(array);
        printArray(array);
    }


    //冒泡排序
    //1.比较数组中，两个相邻的元素，如果第一个数比第二个数大，我们就交换他们的位置
    //2.每一次比较，都会产生一个最大，或最小的数字
    //3.下一轮则可以少一次排序
    //4.依次循环，直到结束
    public static int[] Bubblesort(int[] arrays){
        //外层循环，判断循环要走多少次
        for (int i = 0; i < arrays.length-1; i++){
            //内层循环，比较判断两个数，如果第一个数比第二个数大，则交换位置
            for (int j = 0; j < arrays.length-1-i; j++){        //最外层循环每次都能确定一个数的位置。所以将确定的数排除在外
                if (arrays[j] > arrays[j+1]){
                    int temp = arrays[j];
                    arrays[j] = arrays[j+1];
                    arrays[j+1] = temp;
                }
            }
        }
        return arrays;
    }
    public static int[] Bubblesort1(int[] arrays){
        //外层循环控制次数
        for (int i = 0; i < arrays.length-1; i++){
            boolean flag = false;       //通过flag标识位减少没有意义的比较
            //内层循环，控制交换
            for (int j = 0; j < arrays.length-1-i; j++){
                if (arrays[j]>arrays[j+1]){
                    int temp = arrays[j];
                    arrays[j] = arrays[j+1];
                    arrays[j+1] = arrays[j];
                    flag = true;
                }
            }
            if (flag == false){
                break;
            }
        }
        return arrays;
    }
    //打印数组
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
