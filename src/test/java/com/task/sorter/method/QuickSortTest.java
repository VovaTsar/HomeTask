package com.task.sorter.method;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuickSortTest {

    @Test
    public void shouldReturnQuickSort() {
        int[] array = new int[]{7, 6, 2, -1};
        int[] sortArray = new int[]{-1, 2, 6, 7};

        new QuickSort().sort(array);
        assertArrayEquals(sortArray, array);
    }

    @Test(expected = NullPointerException.class)
    public void throwNullPointerExceptionForQuickSort() {
        int[] testArrayNull = null;
        new QuickSort().sort(testArrayNull);
    }
}