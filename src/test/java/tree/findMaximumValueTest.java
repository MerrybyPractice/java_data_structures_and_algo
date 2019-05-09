package tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class findMaximumValueTest {

    @Test
    public void testMaxValue() {
        BinarySearchTree test = new BinarySearchTree(5);

        assertEquals(5, findMaximumValue.findMaximumValue(test.root));

        test.add(4);
        test.add(3);
        test.add(2);
        test.add(1);

        assertEquals(5, findMaximumValue.findMaximumValue(test.root));

        test.add(6);
        test.add(7);
        test.add(8);
        test.add(9);
        test.add(10);


        assertEquals(10, findMaximumValue.findMaximumValue(test.root));
    }
}