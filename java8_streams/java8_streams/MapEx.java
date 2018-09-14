package com.java8_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapEx {
    static List<Person> personList= Arrays.asList(
            new Person("Tom", 45),
            new Person("sai", 25),
            new Person("pratik", 65),
            new Person("jindal", 15),
            new Person("rajesh", 29),new Person("rajesh", 29));
    public static void main(String[] args) {
        List<String> mappedList = personList.stream().
                map(emp -> emp.getName()).
                collect(Collectors.toList());
        mappedList.forEach(System.out::println);


        //flat map

        List<String> nameCharList = personList.stream()//Stream<Person>
                .map(emp-> emp.getName().split(""))//Stream<String[]>
                .flatMap(array->Arrays.stream(array))//Stream<Stream<String>> then Stream<String>
                .map(str -> str.toUpperCase())
                .filter(str -> !(str.equals(" ")))
                .collect(Collectors.toList());
        nameCharList.forEach(str -> System.out.print(str));
    }
}
