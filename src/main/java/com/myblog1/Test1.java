package com.myblog1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Test1 {
    public static void main(String[] args) {

        List<String> numbers = Arrays.asList("mike", "adam","mike", "stallin");
        List<String> a1 = numbers.stream().filter(a -> a.equals("stallin")).collect(Collectors.toList());
        System.out.println(a1);

    }
}
