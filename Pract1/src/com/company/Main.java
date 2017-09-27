package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello");

        print(args);
    }

    public static void print(String[] args) {
        for (String arg : args) {
            System.out.println(arg);
        }
    }


}
