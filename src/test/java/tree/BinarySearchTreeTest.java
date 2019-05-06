package tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTreeTest {

    //happy path
    @Test
    public void testAdd() {

        BinarySearchTree testAdd = new BinarySearchTree();
        testAdd.add(5);

        assertEquals(5, testAdd.root.value);
        System.out.println(testAdd.root.value);

        testAdd.add(4);
        assertEquals(4, testAdd.root.leftChild.value);

        testAdd.add(6);
        assertEquals(6, testAdd.root.rightChild.value);

        testAdd.add(2);
        assertEquals(2, testAdd.root.leftChild.leftChild.value);

        testAdd.add(3);
        assertEquals(3, testAdd.root.leftChild.leftChild.rightChild.value);

    }

    //edge cases
    @Test
    public void edgeAdd() {
        BinarySearchTree testAdd = new BinarySearchTree();
        testAdd.add(5);
        testAdd.add(4);
        testAdd.add(6);
        testAdd.add(2);
        testAdd.add(3);

        //I expect that it will find six already in the tree and add nothing additional, but throw no errors.
        testAdd.add(6);

        assertNull(testAdd.root.rightChild.leftChild);
        assertNull(testAdd.root.rightChild.rightChild);
    }

    //set up for contains
    public BinarySearchTree testContains = new BinarySearchTree();

    public void setUpContainsRoot() {
        testContains.add(10);
    }

    public void setUpContainsLeft() {


        testContains.add(9);
        testContains.add(8);
        testContains.add(7);
        testContains.add(6);
        testContains.add(5);
        testContains.add(4);
        testContains.add(3);
        testContains.add(2);
        testContains.add(1);

    }

    public void setUpContainsRight() {
        testContains.add(11);
        testContains.add(12);
        testContains.add(13);
        testContains.add(14);
        testContains.add(15);
        testContains.add(16);
        testContains.add(17);
        testContains.add(18);
        testContains.add(19);
        testContains.add(20);
    }

    //happy path
    @Test
    public void testContains() {
        setUpContainsRoot();

        assertTrue(testContains.contains(10));
        assertFalse(testContains.contains(1));

        setUpContainsLeft();

        assertTrue(testContains.contains(1));
        assertFalse(testContains.contains(20));

        setUpContainsRight();

        assertTrue(testContains.contains(1));
        assertTrue(testContains.contains(20));
        assertFalse(testContains.contains(77));
    }
}