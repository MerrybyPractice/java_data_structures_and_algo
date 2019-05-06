package tree;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BinaryTreeTest {

    @Test
    public void testNewTree() {
        BinaryTree testEmptyTree = new BinaryTree();

        assertNull(testEmptyTree.root);
        assertNull(testEmptyTree.current);

    }

    //Set up for traversal testing

    BinarySearchTree traversalTest = new BinarySearchTree(10);

    public void setUpTraversalTest() {

        traversalTest.add(9);
        traversalTest.add(8);
        traversalTest.add(7);
        traversalTest.add(6);
        traversalTest.add(5);
        traversalTest.add(4);
        traversalTest.add(3);
        traversalTest.add(2);
        traversalTest.add(1);
        traversalTest.add(11);
        traversalTest.add(12);
        traversalTest.add(13);
        traversalTest.add(14);
        traversalTest.add(15);
        traversalTest.add(16);
        traversalTest.add(17);
        traversalTest.add(18);
        traversalTest.add(19);
        traversalTest.add(20);
    }

    @Test
    public void testPreOrderTraversal() {
        setUpTraversalTest();
        ArrayList traversalArray = new ArrayList<>();

        assertEquals("[10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]",
                traversalTest.preOrderTraversal(traversalTest.root, traversalArray).toString());
        assertEquals(20, traversalArray.size());
        assertTrue(traversalArray.contains(1));
        traversalArray.contains(20);
    }

    @Test
    public void testInOrderTraversal() {
        setUpTraversalTest();
        ArrayList traversalArray = new ArrayList<>();

        assertEquals("[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]",
                traversalTest.inOrderTraversal(traversalTest.root, traversalArray).toString());
        assertEquals(20, traversalArray.size());
        assertTrue(traversalArray.contains(1));
        assertTrue(traversalArray.contains(20));
    }

    @Test
    public void testPostOrderTraversal() {
        setUpTraversalTest();
        ArrayList traversalArray = new ArrayList<>();

        assertEquals("[1, 2, 3, 4, 5, 6, 7, 8, 9, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10]",
                traversalTest.postOrderTraversal(traversalTest.root, traversalArray).toString());
        assertEquals(20, traversalArray.size());
        assertTrue(traversalArray.contains(1));
        assertTrue(traversalArray.contains(20));
    }
}
