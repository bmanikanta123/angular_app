package com.company;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsEx {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Manikanta","SAI","Raghav");
        //single condition filter
        Stream<String> namesStream = names.stream().filter(name -> {
            return "Manikanta".equals(name);
        });
        namesStream.forEach(System.out::println);

        List<Developer> developers  = Java8SortingTechniques.getDevelopers();
        Developer d = developers.stream().filter(developer -> {
            if(developer.name.equals("Manikanta") && developer.getSalary().equals(new BigDecimal(25000))){
                System.out.println(developer);
            }
            return true;
        }).findAny().orElse(null);
        System.out.println(d);


        //get all the names of the developers
        List<String> developerNames = developers.stream().map(Developer::getName).collect(Collectors.toList());
        developerNames.forEach(System.out::println);



    }
}
