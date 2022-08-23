package com.qiao.struct;

import java.util.Scanner;

/**
 * @Author LiuYuQiao
 * @Data 2022/8/15 14:01
 */
public class IfDemo03 {
    public static void main(String[] args) {
        //考试大于60就是及格，小于60就是不及格
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入成绩：");
        int score = scanner.nextInt();
        if (score == 100){
            System.out.println("恭喜满分");
        }else if (score < 100 && score >= 90){
            System.out.println("A");
        } else if (score < 90 && score >= 80 ) {
            System.out.println("B");
        } else if (score < 80 && score >=70) {
            System.out.println("C");
        } else if (score < 70 && score >=60) {
            System.out.println("D");
        }else if(score < 60 && score >= 0){
            System.out.println("F");
        }else {
            System.out.println("成绩不合法！");
        }

        scanner.close();
    }

}
