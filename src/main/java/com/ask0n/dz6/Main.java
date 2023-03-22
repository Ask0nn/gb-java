package com.ask0n.dz6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        persons.add(new Person("A", "B", 19));
        persons.add(new Person("weq", "qertty", 18));
        persons.add(new Person("qqqq", "fgcxvx", 20));
        persons.add(new Person("ezxc", "jhuyu", 23));
        persons.add(new Person("dasdaa", "ytt", 45));

        persons.stream().filter(p -> p.getAge() > 20).forEach(System.out::println);
    }
}
