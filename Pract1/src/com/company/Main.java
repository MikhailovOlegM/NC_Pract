package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        print(args);
        sort(args);
    }

    public static void print(String[] args) {
        for (String arg : args) {
            System.out.println(arg);
        }
    }

    public static void sort(String[] args) {
        Arrays.sort(args, new Comparator<String>() {
            @Override
            public int compare(String string1, String string2) {
                return string1.compareTo(string2);
            }
        });
        System.out.println(Arrays.toString(args));
    }

}
