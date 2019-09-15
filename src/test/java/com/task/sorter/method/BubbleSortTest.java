package com.task.sorter.method;

import com.task.fibonacci.NoRecursively;
import com.task.sorter.FillingArray;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BubbleSortTest {
    int[] testArray;
    int[] sortedArray;
    int[] testArrayNull;
    @Before
    public void setUp()  {
        testArray =new int[] {7,3,9,1,2};
         sortedArray = new int[] {1,2,3,7,9};
         testArrayNull=null;
    }

    @Test
    public void shouldReturnByBubbleSort() {
       new BubbleSort().sort(testArray);
       assertArrayEquals(sortedArray,testArray);
    }
    @Test(expected = NullPointerException.class)
    public void throwUNullPointerExceptionForBubbleSort() {
        new BubbleSort().sort(testArrayNull);
    }
}