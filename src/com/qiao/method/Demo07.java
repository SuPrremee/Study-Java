package com.qiao.method;

import java.util.Scanner;

public class Demo07 {
    public static void main(String[] args) {
        //写一个计算器，要求实现加减乘除功能，并且能够循环接收新的数据，通过用户交互实现
        Scanner scanner = new Scanner(System.in);
        String input = "yes";//控制循环执行

        while(input.equals("yes")){
            System.out.println("请输入您要做的运算符号：");
            String sign = scanner.next();
            if(sign.equals("+")){
                System.out.println("请输入两个数");
                double num1 = scanner.nextDouble();
                double num2 = scanner.nextDouble();
                add(num1,num2);
            }else if(sign.equals("-")){
                System.out.println("请输入两个数");
                double num1 = scanner.nextDouble();
                double num2 = scanner.nextDouble();
                sub(num1,num2);
            }else if(sign.equals("*")){
                System.out.println("请输入两个数");
                double num1 = scanner.nextDouble();
                double num2 = scanner.nextDouble();
                mul(num1,num2);
            }else if(sign.equals("/")){
                System.out.println("请输入两个数");
                double num1 = scanner.nextDouble();
                double num2 = scanner.nextDouble();
                div(num1,num2);
            }else{
                System.out.println("您的输入有误！");
            }
            System.out.println("是否继续操作，按“yes”继续，" +
                    "其他任意键结束");
            input = scanner.next();
        }
        System.out.println("感谢使用!");
        scanner.close();
    }
    //加
    public static void add(double a,double b){
        double result = a + b;
        System.out.println("计算结果为："+result);
    }
    //减
    public static void sub(double a,double b){
        double result = a - b;
        System.out.println("计算结果为："+result);
    }
    //乘
    public static void mul(double a,double b){
        double result = a * b;
        System.out.println("计算结果为："+result);
    }
    //除
    public static void div(double a,double b){
        if(b == 0){
            System.out.println("除数不能为0！");
            return;
        }
        double result = a / b;
        System.out.println("计算结果为："+result);

    }
}
