package com.task.fibonacci;

public class NoRecursively implements Fibonacci {
    private int first = 0;
    private int second = 1;


    public int findFibonacci(int valueFibonacci) {
        if (valueFibonacci < 0) {
            throw new IllegalArgumentException();
        }
        for (int i = 0; i <= valueFibonacci - 2; i++) {
            int next = first + second;
            first = second;
            second = next;
        }
        return second;
    }
}
