package com.task.sorter.method;


import com.task.sorter.FillingArray;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;


public class BubbleSortTest {

    @Test
    public void shouldReturnByBubbleSort() {
        int[] testArray = FillingArray.fillingArray();
        int[] expected = testArray;
        new BubbleSort().sort(testArray);
        Arrays.sort(expected);
        assertArrayEquals(expected, testArray);
    }

    @Test(expected = NullPointerException.class)
    public void throwNullPointerExceptionForBubbleSort() {
        int[] testArrayNull = null;
        new BubbleSort().sort(testArrayNull);
    }
}