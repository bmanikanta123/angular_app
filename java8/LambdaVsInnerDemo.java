package com.company;

public class LambdaVsInnerDemo {
    void execute(int i,Process p){
        p.proceed(i);
    }
    void doProcess(int i,Process p){
        p.proceed(i);
    }

    void thisCheck(){
        this.execute(1,(int i)->{
            System.out.println(i);
            System.out.println(this);
        });
    }
    public static void main(String[] args) {
        LambdaVsInnerDemo lambdaVsInnerDemo = new LambdaVsInnerDemo();
        lambdaVsInnerDemo.doProcess(1,new Process(){
            @Override
            public void proceed(int i) {
                System.out.println(i);
                System.out.println(this);
            }
        });

        lambdaVsInnerDemo.execute(1,(int i)->{
            System.out.println(i);
            //System.out.println(this);
        });


        //lambdaVsInnerDemo.thisCheck();
    }

}

interface Process{
    void proceed(int i);
}