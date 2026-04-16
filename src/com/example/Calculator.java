package com.example;

public class Calculator {
    private int memory;

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        lastOperation = "SUBTRACT";
        return a - b;
    }

    private String lastOperation = "NONE";

    public String getLastOperation() {
        return lastOperation;
    }

    public void clearMemory() {
        memory = 0;
        lastOperation = "CLEAR";
    }
}
