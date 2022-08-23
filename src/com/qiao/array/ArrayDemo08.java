package com.qiao.array;

public class ArrayDemo08 {
    public static void main(String[] args) {
        //创建一个二维数组 11*11 0：代表没有棋子 1：黑棋 2：白棋
        int[][] arrays = new int[11][11];
        arrays[1][2] = 1;
        arrays[2][3] = 2;
        //输出原始数组
        System.out.println("输出原始数组");
        //for-echo循环
        for (int[] ints : arrays) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }

        //转化成稀疏数组
        //获取有效值的个数
        int sum = 0;
        for (int i = 0; i < 11; i++)
        {
            for (int j = 0; j < 11; j++){
                if(arrays[i][j] != 0){
                    sum++;
                }
            }
        }
        System.out.println("有效值个数:" + sum);
        //创建一个稀疏数组的数组
        int[][] arrays2 = new int[sum+1][3];
        arrays2[0][0] = 11;
        arrays2[0][1] = 11;
        arrays2[0][2] = sum;
         //遍历二维数组，将非零的值，存放稀疏数组中
        int count = 0;
        for (int i = 0; i < arrays.length; i++){
            for (int j = 0; j < arrays[i].length; j++){
               //找出不为0的数的下表
                if(arrays[i][j] != 0){
                   count++;
                   arrays2[count][0] = i;   //将行数赋值
                   arrays2[count][1] = j;   //将列数赋值
                   arrays2[count][2] = arrays[i][j];    //将值赋值
               }
            }
        }
        //输出稀疏数组
        System.out.println("输出稀疏数组");
        for(int i = 0; i<arrays2.length; i++){
            System.out.println(arrays2[i][0] + "\t" + arrays2[i][1] +"\t" + arrays2[i][2] + "\t");
        }
//        for (int i = 0; i < arrays1.length; i++){
//            for (int j = 0; j < arrays1.length; j++){
//                System.out.print(arrays1[i][j] + "\t");
//            }
//            System.out.println();
//        }
        //1.读取稀疏数组
        int[][] array3 = new int[arrays2[0][0]][arrays2[0][1]]; //arrays2[0][0] = 11，arrays2[0][1] = 11 ==> array3[arrays2[0][0]][arrays2[0][1]] = array3[11][11]
        //2.给其中的元素还原它的值
        //array3[1][2] = 1,array[2][3] = 2
        for (int i = 1; i < arrays2.length; i++){
            array3[arrays2[i][0]][arrays2[i][1]] = arrays2[i][2];
        }
        System.out.println("输出还原数组");
        //for-echo循环
        for (int[] ints : array3) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
    }
}
