package com.ask0n.dz3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = IntStream.range(1, 21).boxed().collect(Collectors.toList());
        list1 = list1.stream().filter(p -> p % 2 == 0).collect(Collectors.toList());
        list1.forEach(System.out::println);

        System.out.println("=".repeat(10));

        List<String> list2 = new ArrayList<>(List.of("string", "s", "5", "10", "-12", "my_value"));
        list2.forEach(System.out::println);
        list2 = list2.stream().filter(p -> !isInteger(p)).collect(Collectors.toList());
        System.out.println("-".repeat(10));
        list2.forEach(System.out::println);
    }

    public static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
