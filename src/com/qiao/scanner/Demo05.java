package com.qiao.scanner;

import java.util.Scanner;

/**
 * @Author LiuYuQiao
 * @Data 2022/8/15 12:52
 */
public class Demo05 {
    public static void main(String[] args) {
//        //可以输入多个数字并求求其总合与平均数，每输入一个数字用户车确认，通过输入非数字来结束输入并输出执行结果
//
//        int i = 0;
//        int num1 = 0;
//        float num2 = 0.0f;
//        double sum = 0.0;
//        double avg = 0.0f;
//        //键盘接受数据
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入数据：");
//       do {
//           if (scanner.hasNextInt()){
//               num1 += scanner.nextInt();
//           }else {
//               num2 += scanner.nextFloat();
//           }
//           i++;
//       }while(scanner.hasNextLine()==scanner.hasNextInt()|| scanner.hasNextLine()== scanner.hasNextFloat());
//       sum = num1 + num2;
//       avg = sum / i;
//        System.out.println("总合为："+sum);
//        System.out.println("平均数为："+avg);
//        scanner.close();
//    }
      //可以输入多个数字并求求其总合与平均数，每输入一个数字用户车确认，通过输入非数字来结束输入并输出执行结果
        Scanner scanner = new Scanner(System.in);

        //和
        double sum = 0;
        //计算输入了多少个数字
        int m = 0;

        //通过循环判断是否还有输入，并在里面对每一次求和合统计
        while (scanner.hasNextDouble()){
           double x = scanner.nextDouble();
           sum = sum + x;
           m = m + 1;
           System.out.println("你输入了第"+ m +"个数据,当前结果为sum = " + sum);
        }
        System.out.println(m + "个数的和为" + sum);
        System.out.println(m + "个数的平均值是" + ( sum / m));
        scanner.close();
    }
}
