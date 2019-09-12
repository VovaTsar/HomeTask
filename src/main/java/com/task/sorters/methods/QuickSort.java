package com.task.sorters.methods;

public class QuickSort extends SortPoint {
    public QuickSort(int[] array) {
        super(array);
    }

    @Override
    public void sort() {
        if (this.array == null) {
            throw new NullPointerException();
        } else {
            System.out.println("QuickSort");
            quickSort(0, this.array.length - 1);
        }
    }

    private void quickSort(int low, int high) {
        int i = low, j = high;
        int pivot  = array[low + (high - low) / 2];

        while (i <= j) {
            while (array[i] < pivot ) i++;
            while (array[j] > pivot ) j--;
            if (i <= j) {
                swap(i, j);
                i++;
                j--;
            }
        }

        if (low < j) quickSort(low, j);
        if (high>i) quickSort(i, high);
    }
}

