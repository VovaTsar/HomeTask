package com.task.sorter.method;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InsertionSortTest {

    @Test
    public void shouldReturnInsertionSort() {
        int[] array = new int[]{7, 6, 2, -1};
        int[] sortArray = new int[]{-1, 2, 6, 7};

        new InsertionSort().sort(array);
        assertArrayEquals(sortArray, array);
    }

    @Test(expected = IllegalArgumentException.class)
    public void throwIllegalArgumentExceptionForInsertionSort() {
        int [] testArrayNull= null;
        new InsertionSort().sort(testArrayNull);
    }
}