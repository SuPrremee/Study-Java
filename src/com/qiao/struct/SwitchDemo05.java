package com.qiao.struct;

/**
 * @Author LiuYuQiao
 * @Data 2022/8/15 15:53
 */
public class SwitchDemo05 {
    public static void main(String[] args) {
        String name = "陶佳宝";
        //反编译 java---class(字节码文件)---反编译(IDEA)
        switch (name){
            case "陶佳宝":
                System.out.println("陶佳宝");
                break;
            case "胡健":
                System.out.println("胡健");
                break;
            default:
                System.out.println("无");

        }
    }
}
