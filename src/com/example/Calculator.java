package com.example;

public class Calculator {
    private int memory;

    public int add(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b, int c) {
        return a * b * c;
    }

    private final String VERSION = "1.1-B";

    public void printVersion() {
        System.out.println("Calculator version: " + VERSION);
    }
}
