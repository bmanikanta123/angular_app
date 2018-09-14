package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Java8MapSortingExample {
    public static void main(String[] args) {


        List<String> strList = Arrays.asList("Manikanta","SAI","RAGHAVAIAH","RAGHAVAIAH","RAGHABAIAH","SAI");
        /*Map<String,Integer> countData = new HashMap<>();
        for(String str:strList){
            if(countData.containsKey(str)){
                countData.put(str,countData.get(str)+1);
            }else{
                countData.put(str,1);
            }
        }
        System.out.println(countData);
        */

        Map<String,Long> data = strList.stream().collect(
                Collectors.groupingBy(Function.identity(),Collectors.counting())
        );
        System.out.println(data);
    }
}
