import static java.util.Arrays.binarySearch;
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;


public class BinarySearchTest {

    @Test
    public void binarySearchTest() {
        //happy path
        int[] testArray = {1, 3, 4, 5, 6, 7};

        int returnValue = (binarySearch(testArray, 7));

        assertEquals(5, returnValue);

        //empty array

        int[] emptyArray = {};

        int emptyReturnValue = (binarySearch(emptyArray, 0));

        assertEquals(-1, emptyReturnValue);

        int[] nonSequentialArray = {22, 5, 13, 4, 9, 0};

        int nonSequentialReturn = (binarySearch(nonSequentialArray, 13));

        assertEquals(2, nonSequentialReturn);
    }


}