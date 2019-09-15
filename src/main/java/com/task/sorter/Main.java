package com.task.sorter;

import com.task.sorter.method.BubbleSort;
import com.task.sorter.method.InsertionSort;
import com.task.sorter.method.QuickSort;
import com.task.sorter.method.Sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] testArray = FillingArray.fillingArray();
        Sort bubbleSort= new BubbleSort();
        bubbleSort.sort(testArray);
        System.out.println(Arrays.toString(testArray));

        int[] testArray1 = FillingArray.fillingArray();
        Sort quickSort = new QuickSort();
        quickSort.sort(testArray1);
        System.out.println(Arrays.toString(testArray1));

        int[] testArray2 = FillingArray.fillingArray();
        Sort insertionSort= new InsertionSort();
        insertionSort.sort(testArray2);
        System.out.println(Arrays.toString(testArray2));
    }
}
