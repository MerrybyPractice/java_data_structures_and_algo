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

    @Test
    public void testDupInsertionSort() {
        int[] array = new int[]{5, 3, 7, 2, 5, 7, 2};
        int[] result = new int[]{2, 2, 3, 5, 5, 7, 7};

        assertArrayEquals(result, InsertionSort.insertionSort(array));
        assertEquals(7, InsertionSort.insertionSort(array).length);
        assertEquals(7, InsertionSort.insertionSort(array)[6]);
    }

    @Test
    public void testEmptyArray() {

        int[] array = new int[]{};

        assertArrayEquals(array, InsertionSort.insertionSort(array));
    }
}