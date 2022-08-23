package com.qiao.struct;

/**
 * @Author LiuYuQiao
 * @Data 2022/8/15 15:23
 */
public class SwitchDemo04 {
    public static void main(String[] args) {
       //case穿透 switch匹配一个具体的值
        char grade = 'F';
        switch (grade){
            case 'A':
                System.out.println("优秀");
                break;
            case 'B':
                System.out.println("良好");
            case 'C':
                System.out.println("及格");
            case 'D':
                System.out.println("再接再厉");
            case 'E':
                System.out.println("挂科");
            default:
                System.out.println("未知等级");
        }
    }
}
