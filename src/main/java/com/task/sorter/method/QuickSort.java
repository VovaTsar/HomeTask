package com.task.sorter.method;

import com.task.sorter.FillingArray;

public class QuickSort implements Sort {


    public void sort(int [] array) {
        if (array == null) {
            throw new NullPointerException();
        } else {
            System.out.println("QuickSort");
            quickSort(array,0, array.length - 1);
        }
    }

    private void quickSort(int []array, int low, int high) {
        int i = low, j = high;
        int pivot  = array[low + (high - low) / 2];

        while (i <= j) {
            while (array[i] < pivot ) i++;
            while (array[j] > pivot ) j--;
            if (i <= j) {
                FillingArray.swap(array,i, j);
                i++;
                j--;
            }
        }

        if (low < j) quickSort(array,low, j);
        if (high>i) quickSort(array,i, high);
    }
}

