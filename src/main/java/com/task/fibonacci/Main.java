package com.task.fibonacci;

public class Main {
    public static void main(String[] args) {
      Fibonacci noRecursively=new NoRecursively();
        System.out.println(noRecursively.findFibonacci(3));

        Fibonacci recursively = new Recursively();
        System.out.println( recursively.findFibonacci(3));

    }
}
