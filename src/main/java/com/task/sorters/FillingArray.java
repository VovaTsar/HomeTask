package com.task.sorters;

import java.util.Random;

public final class FillingArray {
    private static final int ARRAY_SIZE = 10;

    private FillingArray() {
    }

    public static int[] fillingArray() {
        int array[] = new int[ARRAY_SIZE];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(15);
        }
        return array;
    }
}
