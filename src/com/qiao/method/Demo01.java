package com.qiao.method;

/**
 * @Author LiuYuQiao
 * @Data 2022/8/16 18:07
 */
public class Demo01 {
    //main方法
    public static void main(String[] args) {
        int sum = add(3,5);
        System.out.println(sum);
        test();
    }

    //加法
    //在main函数外添加方法需要用static修饰即Demo01的类方法
    //满足原子性即一个方法只完成一个功能
    public static int add(int a,int b){
        return a+b;
    }

    public static void test(){
        //用for循环输出1-1000之间能够被5整除的数，并且每行输出3个
        for (int i = 1; i <= 1000; i++){
            if (i%5 == 0){
                System.out.print(i+"\t\t");
                if (i%3 == 0){
                    System.out.print("\n");
                }
            }
        }
    }
}
