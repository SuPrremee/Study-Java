package com.exception;

public class Test2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        //Ctrl + Alt + T
        try {
            System.out.println(a/b);
        } catch (Exception e) {
            System.exit(0);
            e.printStackTrace();//打印错误的栈信息
            throw new RuntimeException(e);
        } finally {
        }

    }
}
