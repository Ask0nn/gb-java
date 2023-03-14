package com.ask0n.dz4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.PatternSyntaxException;

public class Main {
    private static final String RULES = "{str~num} -> {Человек~2}" +
            "\n\tstr - Слово" +
            "\n\tnum - Номер в списке" +
            "\n{print~num} -> {print~2} - Человек" +
            "\n\tprint - Команда для вывода" +
            "\n\tnum - Номер в списке" +
            "\nexit - выход";

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        String in;
        while (!(in = input(RULES)).equals("exit")) {
            try {
                String[] obj = in.split("~", 2);
                if (obj[0].equals("print"))
                    System.out.println(map.get(obj[1]));
                else {
                    map.put(obj[1], obj[0]);
                    System.out.println("Запись добавлена");
                }
            } catch (PatternSyntaxException e) {
                System.out.println("Ошибка ввода!");
            }
        }
    }

    public static String input(String message) {
        System.out.println(message);
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
}
