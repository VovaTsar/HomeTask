package com.task.sorter.method;

public class InsertionSort implements Sort {

    @Override
    public void sort(int[] array) {
        int in, out;
        for (out = 1; out < array.length; out++) {
            int temp = array[out];
            in = out;

            while (in > 0 && temp <= array[in - 1]) {
                array[in] = array[in - 1];
                --in;
            }

            array[in] = temp;

        }
    }
}

