package com.task.factorial;

import java.math.BigInteger;

public class Factorial {

    public static BigInteger factorial(BigInteger number) {
        if(number.intValue()<0){
            throw new IllegalArgumentException();
        }

        BigInteger result = BigInteger.valueOf(1);
        for (long factor = 2; factor <= number.longValue(); factor++) {
            result = result.multiply(BigInteger.valueOf(factor));
        }
        return result;
    }
}
