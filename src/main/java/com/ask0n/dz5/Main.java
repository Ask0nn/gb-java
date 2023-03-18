package com.ask0n.dz5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    private static final String LINE = "Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись";

    public static void main(String[] args) {
        List<String> words = Arrays.asList(LINE.split(" "));
        words.sort(Comparator.comparing(String::length));
        words.forEach(System.out::println);
    }

}
