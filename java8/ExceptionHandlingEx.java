package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExceptionHandlingEx {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4);
        int key=0;
        ProcessDiv processDiv = (i,j)-> System.out.println(i/j);


        numbers.forEach(n->{
            try {
                processDiv.perform(n, key);
            }catch (ArithmeticException e){
                System.out.println(e.getMessage());
            }
        });


    }
}
interface ProcessDiv{
    void perform(int i,int j);
}
