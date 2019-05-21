package insertionsort;

import org.junit.Test;

import static org.junit.Assert.*;

public class InsertionSortTest {


    @Test
    public void testInsertionSort() {
        int[] array = new int[]{1, 6, 3, 9, 5, 7};
        int[] result = new int[]{1, 3, 5, 6, 7, 9};

        assertArrayEquals(result, InsertionSort.insertionSort(array));
        assertEquals(6, InsertionSort.insertionSort(array).length);
        assertEquals(9, InsertionSort.insertionSort(array)[5]);
    }
}