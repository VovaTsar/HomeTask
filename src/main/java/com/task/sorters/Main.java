package com.task.sorters;

import com.task.sorters.methods.BubbleSort;
import com.task.sorters.methods.InsertionSort;
import com.task.sorters.methods.QuickSort;
import com.task.sorters.methods.SortPoint;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] testArray = FillingArray.fillingArray();
        SortPoint sortPoint = new BubbleSort(testArray);
        sortPoint.sort();
        System.out.println(Arrays.toString(testArray));

        int[] testArray1 = FillingArray.fillingArray();
        SortPoint sortPoint1 = new QuickSort(testArray1);
        sortPoint1.sort();
        System.out.println(Arrays.toString(testArray1));

        int[] testArray2 = FillingArray.fillingArray();
        SortPoint sortPoint2 = new InsertionSort(testArray2);
        sortPoint2.sort();
        System.out.println(Arrays.toString(testArray2));
    }
}
