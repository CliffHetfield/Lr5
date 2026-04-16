package com.example;

public class Calculator {
    private int memory;

    public int add(int a, int b) {
        return a + b;
    }

    public double divide(int a, int b) {
        if (b == 0) return 0;
        return (double) a / b;
    }
}
