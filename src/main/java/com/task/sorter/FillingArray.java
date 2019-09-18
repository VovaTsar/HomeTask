package com.task.sorter;

import java.util.Random;

public final class FillingArray {
    private static final int ARRAY_SIZE = 10;


    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
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
