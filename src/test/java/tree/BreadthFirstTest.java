package tree;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BreadthFirstTest {

    @Test
    public void testBreadthFirst() {
        BinarySearchTree test = new BinarySearchTree(5);

        assertEquals("[5]", BreadthFirst.breadthFirst(test.root).toString());
        assertEquals(1, BreadthFirst.breadthFirst(test.root).size());

        test.add(4);
        test.add(3);
        test.add(2);
        test.add(1);

        assertEquals("[5, 4, 3, 2, 1]", BreadthFirst.breadthFirst(test.root).toString());
        assertEquals(5, BreadthFirst.breadthFirst(test.root).size());

        test.add(6);
        test.add(7);
        test.add(8);
        test.add(9);
        test.add(10);


        assertEquals("[5, 4, 6, 3, 7, 2, 8, 1, 9, 10]", BreadthFirst.breadthFirst(test.root).toString());
        assertEquals(10, BreadthFirst.breadthFirst(test.root).size());
    }

    @Test
    public void testBreadthFirstEmpty() {
        BinaryTree empty = new BinaryTree();

        assertEquals("[]", BreadthFirst.breadthFirst(empty.root).toString());
        assertEquals(0, BreadthFirst.breadthFirst(empty.root).size());

        //throwing this one in as I expect the breadth first to handle null nodes with ease by simply ignoring them till
        //it hits the end of the leaves, when it returns the return statement based on the try catch block. .
        assertNull(empty.root);
    }

}
