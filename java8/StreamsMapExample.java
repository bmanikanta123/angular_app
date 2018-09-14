package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsMapExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("manikanta","juli","agasthya");
        for(String name:names){
            System.out.println(name.toUpperCase());
        }
        //using lambda expressions to display but we cannot collect here we need to write some more logic
        //names.forEach(p-> System.out.println(p.toUpperCase()));

        //using streams with method reference
        //List<String> namesUppercase = names.stream().map(String::toUpperCase).collect(Collectors.toList());
        //using streams with lamda expression
        List<String> namesUppercase = names.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
        namesUppercase.forEach(System.out::println);

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        List<Integer> multipliedBy2 = numbers.stream().map(n->n*2).collect(Collectors.toList());
        multipliedBy2.forEach(System.out::println);
    }
}
