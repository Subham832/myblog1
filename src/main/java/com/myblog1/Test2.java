package com.myblog1;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test2 {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("mike", 30,"Chennai"),
                new Employee("stallin", 25,"Chennai"),
                new Employee("adam", 31,"Pune"),
                new Employee("sam", 31,"Bengaluru")
        );

        Map<String, List<Employee>> collect = employees.stream().collect(Collectors.groupingBy(e -> e.getCity()));
       for(Map.Entry<String, List<Employee>> entry: collect.entrySet()){
           String city = entry.getKey();
           List<Employee> employeesWithAge = entry.getValue();

           System.out.println("city: " +city+"-----");
           for(Employee e : employeesWithAge){
               System.out.println(e.getName());
               System.out.println(e.getAge());
           }


       }
    }
}