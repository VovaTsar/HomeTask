package com.task.fibonacci;

public class Recursively implements Fibonacci {



    public int findFibonacci(int valueFibonacci) {
        if(valueFibonacci<0){
            throw new IllegalArgumentException();
        }
        if (valueFibonacci == 0) {
            return 0;
        } else if (valueFibonacci == 1) {
            return 1;
        } else {
            return findFibonacci(valueFibonacci - 1) + findFibonacci(valueFibonacci - 2);
        }
    }
}
