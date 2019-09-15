package com.task.fibonacci;

import com.task.factorial.Factorial;
import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.*;

public class NoRecursivelyTest {


    @Test
    public void shouldReturnValueNoRecursivelyFibonacci() {
        int actual = new NoRecursively().findFibonacci(3);
        assertEquals(2, actual);
    }
    @Test(expected = UnsupportedOperationException.class)
    public void throwUnsupportedOperationExceptionForFactorial() {
        new NoRecursively().findFibonacci(-2);
    }
}