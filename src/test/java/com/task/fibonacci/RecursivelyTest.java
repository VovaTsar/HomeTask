package com.task.fibonacci;

import org.junit.Test;

import static org.junit.Assert.*;

public class RecursivelyTest {

    @Test
    public void shouldReturnValueRecursivelyFibonacci() {
        int actual = new NoRecursively().findFibonacci(3);
        assertEquals(2, actual);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void throwUnsupportedOperationExceptionForFactorial() {
        new NoRecursively().findFibonacci(-2);
    }
}