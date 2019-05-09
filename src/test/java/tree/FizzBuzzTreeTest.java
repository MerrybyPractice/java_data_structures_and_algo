package tree;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class FizzBuzzTreeTest {

    @Test
    public void allDivisibleByThree() {
        BinarySearchTree threes = new BinarySearchTree(9);
        threes.add(6);
        threes.add(3);
        threes.add(12);

        ArrayList<Object> fizzList = new ArrayList<>();
        ArrayList test = FizzBuzzTree.fizzBuzzTree(threes.root, fizzList);

        assertEquals("[Fizz, Fizz, Fizz, Fizz]", test.toString());
        assertEquals(4, test.size());
        assertFalse(test.contains(3));
    }

    @Test
    public void allDivisibleByFive() {
        BinarySearchTree fives = new BinarySearchTree(20);
        fives.add(5);
        fives.add(10);
        fives.add(25);

        ArrayList<Object> buzzList = new ArrayList<>();
        ArrayList test = FizzBuzzTree.fizzBuzzTree(fives.root, buzzList);

        assertEquals("[Buzz, Buzz, Buzz, Buzz]", test.toString());
        assertEquals(4, test.size());
        assertFalse(test.contains(5));
    }

    @Test
    public void allDivisibleByThreeAndFive() {
        BinarySearchTree both = new BinarySearchTree(45);
        both.add(15);
        both.add(30);
        both.add(60);

        ArrayList<Object> fizzBuzzList = new ArrayList<>();
        ArrayList test = FizzBuzzTree.fizzBuzzTree(both.root, fizzBuzzList);

        assertEquals("[FizzBuzz, FizzBuzz, FizzBuzz, FizzBuzz]", test.toString());
        assertEquals(4, test.size());
        assertFalse(test.contains(15));
    }

    @Test
    public void allDivisibleByNeither() {
        BinarySearchTree neither = new BinarySearchTree(7);
        neither.add(4);
        neither.add(11);
        neither.add(13);

        ArrayList<Object> emptyList = new ArrayList<>();
        ArrayList test = FizzBuzzTree.fizzBuzzTree(neither.root, emptyList);

        assertEquals("[4, 7, 11, 13]", test.toString());
        assertEquals(4, test.size());
        assertTrue(!test.contains(3) || !test.contains(5));
    }

    @Test
    public void negativesMixed() {
        BinarySearchTree negatives = new BinarySearchTree(-45);
        negatives.add(-5);
        negatives.add(-3);
        negatives.add(-13);

        ArrayList<Object> negativesList = new ArrayList<>();
        ArrayList test = FizzBuzzTree.fizzBuzzTree(negatives.root, negativesList);

        assertEquals("[FizzBuzz, -13, Buzz, Fizz]", test.toString());
        assertEquals(4, test.size());
        assertTrue(test.contains(-13));
    }
}
