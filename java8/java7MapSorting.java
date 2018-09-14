package com.company;

import java.util.*;

public class java7MapSorting {
    public static void main(String[] args) {
        /*Map<String,Integer> data = new TreeMap<>();
        data.put("A",20);
        data.put("D",25);
        data.put("B",30);
        data.put("C",20);
        System.out.println(data);*/

        Map<String,Integer> data = new HashMap<>();
        data.put("A",20);
        data.put("D",25);
        data.put("B",30);
        data.put("C",20);
        //System.out.println(data);

        /*TreeMap<String,Integer> comparatorByKey = new TreeMap<String,Integer>(
                new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        return o2.compareTo(o1);
                    }
                }
        );
        comparatorByKey.putAll(data);
        System.out.println(comparatorByKey);*/

        Set<Map.Entry<String,Integer>> set = data.entrySet();
        List<Map.Entry<String,Integer>> list = new ArrayList<>(set);

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue()-o1.getValue();
            }
        });

        System.out.println(list);
    }
}
