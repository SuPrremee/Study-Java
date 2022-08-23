package com.qiao.struct;

/**
 * @Author LiuYuQiao
 * @Data 2022/8/16 0:45
 */
public class ForDemo01 {
    public static void main(String[] args) {
        //计算0-100之间奇数和偶数的和

        //奇数和
        int oddsum = 0;

        //偶数和
        int evensum = 0;
        for(int i = 1;i <= 100;i++){
            if (i%2 == 0){
                evensum += i;
            }else {
                oddsum += i;
            }
        }
        System.out.println("1-100之间的奇数和："+oddsum);
        System.out.println("1-100之间的偶数和："+evensum);

//        int a = 1;
//        while(a <=100){ //循环条件
//            System.out.println(a);
//            a += 2; //迭代
//        }
//        System.out.println("while循环结束！");
//
//        //初始化//条件判断//迭代
//        for (int i = 1; i <= 100; i++){
//            System.out.println(i);
//        }
//        System.out.println("for循环结束！");
    }
}
