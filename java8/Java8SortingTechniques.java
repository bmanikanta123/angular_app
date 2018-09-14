package com.company;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.stream.Collectors;

public class Java8SortingTechniques {
    public static void main(String[] args) {
        List<Developer> developers = getDevelopers();
        //sort based on name java7
        Collections.sort(developers,new Comparator<Developer>() {
            @Override
            public int compare(Developer o1, Developer o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println("Sorting by name");
        displayUsingJava7(developers);

        //sorting by salary
        Collections.sort(developers,new Comparator<Developer>() {
            @Override
            public int compare(Developer o1, Developer o2) {
                return o1.getSalary().intValue()-o2.getSalary().intValue();
            }
        });
        System.out.println("Sorting by salary");
        displayUsingJava7(developers);




        /*
            java 8

            sort based on name java8

            Inner class style
         */
        /*developers.sort(new Comparator<Developer>() {
            @Override
            public int compare(Developer o1, Developer o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });*/

        //simplified way using lamda expression
        developers.sort((o1,o2)->o1.getName().compareTo(o2.getName()));

        System.out.println("Sorting by name using java8");
        displayUsingJava8(developers);

        //sorting by salary using innerclass
        /*developers.sort(new Comparator<Developer>() {
            @Override
            public int compare(Developer o1, Developer o2) {
                return o1.getSalary().intValue()-o2.getSalary().intValue();
            }
        });*/

        System.out.println("Sorting by salary using java8");
        //simplified way using lamda expression
        developers.sort((o1,o2)-> o1.getSalary().intValue()-o2.getSalary().intValue());
        displayUsingJava8(developers);

        //reverse order by salary
        //simplified way using lamda expression
        System.out.println("reverse order by salary using java8");
        Comparator<Developer> comparatorUsingName = (o1,o2)-> o1.getSalary().intValue()-o2.getSalary().intValue();
        developers.sort(comparatorUsingName.reversed());
        displayUsingJava8(developers);


    }

    private static void displayUsingJava7(List<Developer> developers){
        for(Developer developer:developers)
            System.out.println(developer);
    }

    private static void displayUsingJava8(List<Developer> developers){
        //using foreach with lamda expression
        developers.forEach(developer -> System.out.println(developer));
        /*
            using method reference style

            developers.forEach(System.out::println);

         */

        

    }

    public static List<Developer> getDevelopers(){
        List<Developer> developers = new ArrayList<>();
        developers.add(new Developer("Manikanta",25,new BigDecimal(25000)));
        developers.add(new Developer("Kachi",45,new BigDecimal(250000)));
        developers.add(new Developer("Raghav",35,new BigDecimal(45000)));
        developers.add(new Developer("Sai",26,new BigDecimal(35000)));

        return developers;
    }
}
