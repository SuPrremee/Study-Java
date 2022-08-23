package com.oop.demo01;

public class Demo03 {
    public static void main(String[] args) {
        int sum1 = new Demo03().add(1,2);
        int sum2 = Demo03.add(1,2,3,4,5,6,7);;
        System.out.println(sum1);
        System.out.println(sum2);

    }
    public int add(int a,int b){
        return a + b;
    }
    public static int add(int...numbers){
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }
}
