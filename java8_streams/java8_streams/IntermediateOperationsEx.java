package com.java8_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntermediateOperationsEx {
    static List<Person> employeeList= Arrays.asList(
            new Person("Tom", 45),
            new Person("sai", 25),
            new Person("pratik", 65),
            new Person("jindal", 15),
            new Person("rajesh", 29),new Person("rajesh", 29));
    public static void main(String[] args) {
        //filter method
        List<Person> filteredList= employeeList.stream().filter((Person e)-> e.getAge() > 24).collect(Collectors.toList());
        System.out.println("After applying filter method");
        filteredList.forEach(System.out::println);
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");


        //distinct method
        filteredList= filteredList.stream().distinct().collect(Collectors.toList());
        System.out.println("After applying distinct() method");
        filteredList.forEach(System.out::println);
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");


        //limit method
        filteredList= filteredList.stream().limit(2).collect(Collectors.toList());
        System.out.println("After applying limit(2) method");
        filteredList.forEach(System.out::println);
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");


        //skip method
        filteredList= filteredList.stream().skip(1).collect(Collectors.toList());
        System.out.println("After applying skip(1) method");
        filteredList.forEach(System.out::println);
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
}
