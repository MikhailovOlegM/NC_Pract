package com.company;

public class Main {

    public static void main(String[] args) {
    }

    public static void print(String[] args) {
        for (String arg : args) {
            System.out.println(arg);
        }
    }

    public static void sort(String[] args) {
        int shortestStringIndex;

        for (int i = 0; i < args.length - 1; i++) {
            shortestStringIndex = i;
            for (int j = i + 1; j < args.length; j++) {
                if (args[j]
                        .compareTo(args[shortestStringIndex]) < 0) {
                    shortestStringIndex = j;
                }
            }
            if (shortestStringIndex != i) {
                String temp = args[i];
                args[i] = args[shortestStringIndex];
                args[shortestStringIndex] = temp;
            }
        }
    }

}
