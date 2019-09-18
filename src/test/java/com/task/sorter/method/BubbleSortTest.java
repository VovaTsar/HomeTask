package com.task.sorter.method;


import com.task.sorter.FillingArray;
import org.junit.Test;

import static java.util.Arrays.sort;
import static org.junit.Assert.*;


public class BubbleSortTest {

    @Test
    public void shouldReturnByBubbleSort() {
        int[] array = new int[]{7, 6, 2, -1};
        int[] sortArray = new int[]{-1, 2, 6, 7};

        new BubbleSort().sort(array);
        assertArrayEquals(sortArray, array);
    }

    @Test(expected = IllegalArgumentException.class)
    public void throwIllegalArgumentExceptionForBubbleSort() {
        int [] testArrayNull= null;
        new BubbleSort().sort(testArrayNull);
    }
}