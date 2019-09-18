package com.task.factorial;

import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

public class FactorialTest {

    @Test
    public void shouldReturnFactorialBigMath() {
        BigInteger expected = BigInteger.valueOf(3628800);
        BigInteger actual = Factorial.factorial(BigInteger.valueOf(10));
        assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void throwIllegalArgumentExceptionForFactorial() {
        BigInteger number = BigInteger.valueOf(-1);
        Factorial.factorial(number);
    }

}