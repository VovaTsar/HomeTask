package com.task.sorters.methods;

public class InsertionSort extends SortPoint {
    public InsertionSort(int[] array) {
        super(array);
    }

    @Override
    public void sort() {
        if (this.array == null) {
            throw new NullPointerException();
        }else {
            System.out.println("InsertionSort");
            int in, out;

            for (out = 1; out < array.length; out++) {
                int temp = array[out];
                in = out;

                while (in > 0 && temp <= array[in - 1]) {
                    array[in] = array[in - 1];
                    --in;
                }

                this.array[in] = temp;
            }
        }
    }
}

