package com.ask0n.dz1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(isSumBetween10And20(5, 15)); // true
        System.out.println(isSumBetween10And20(7, 15)); // false

        System.out.println(isPositive(5)); // true
        System.out.println(isPositive(-3)); // false

        printString("abcd", 5); // abcdabcdabcdabcdabcd

        int[] array1 = new int[] { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        System.out.println(Arrays.toString(array1));
        array1 = Arrays.stream(array1).map(p -> p == 0 ? 1 : 0).toArray();
        System.out.println(Arrays.toString(array1));

        int[] array2 = new int[] { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        System.out.println(Arrays.toString(array2));
        array2 = Arrays.stream(array2).map(p -> p < 6 ? p * 2 : p).toArray();
        System.out.println(Arrays.toString(array2));

        int[][] array = new int[7][7];
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 1;
            array[array.length - i - 1][i] = 1;
        }
        Arrays.stream(array).map(Arrays::toString).forEach(System.out::println);
    }

    public static boolean isSumBetween10And20(int n, int m) {
        return n + m >= 10 && n + m <= 20;
    }

    public static boolean isPositive(int i) {
        return i >= 0;
    }

    public static void printString(String msg, int i) {
        System.out.println(msg.repeat(i));
    }

    private static boolean isLeapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

    private static int[] createArray(int len, int initalValue) {
        int[] result = new int[len];
        return Arrays.stream(result).map(p -> initalValue).toArray();
    }
}
