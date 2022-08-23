package com.exception;

public class Test {
    public static void main(String[] args) {

        try {
            new Test().test(1, 0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }
    //假设这方法中处理不了这个异常，方法上抛出异常
    public void test(int a,int b) throws ArithmeticException{
        if (b == 0){
            //主动的抛出异常 throw throws
            throw new ArithmeticException();//一般在方法中使用
        }
    }
}
/*
//假设要捕获多个异常，从大到小
        try{//监控区域
            //new Test().a();
            if (b == 0){
                //主动的抛出异常 throw throws
                throw new ArithmeticException();
            }
            System.out.println(a/b);
        }catch (Error e){//捕获异常
            System.out.println("Error");

        }catch (Exception e){
            System.out.println("Exception");
        }catch (Throwable e){
            System.out.println("Throwable");
        }
        finally {
            System.out.println("finally");
        }

        //finally 可以不要finally 假设IO，资源需要关闭
    }
    public void a(){
        b();
    }
    public void b (){
        a();
    }
 */