package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class forEachExample {
    public static void main(String[] args) {
        Map<String,Integer> employees = new HashMap<>();
        employees.put("MANIKANTA",25000);
        employees.put("SAI",35000);
        employees.put("RAGHAV",45000);
        employees.put("KACHI",55000);
        //before java8 we can loop map in the below ways, we can do in many ways these are some ways
        for (Map.Entry<String, Integer> entry : employees.entrySet()) {
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }
        for (String key: employees.keySet()) {
            System.out.println("Key :"+key+"->"+employees.get(key));
        }
        //java8 1 approach
        employees.forEach((k,v)->System.out.println("Key :"+k+"->"+employees.get(k)));
        //the actual way this can be simplified like above lambda expression
        employees.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String s, Integer integer) {
                System.out.println("Key :"+s+"->"+employees.get(s));
            }
        });
        //conditional foreach
        employees.forEach((k,v)->{
            if("Manikanta".equals(k)){
                System.out.println("Key :"+k+"->"+v);
            }
            if(k.startsWith("K")){
                System.out.println("Key :"+k+"->"+v);
            }
        });


        AddI addI = (int a,int b)->(a+b);
        System.out.println(addI.add(1,2));
    }


}
@FunctionalInterface
interface AddI{
    public int add(int a,int b);
}



