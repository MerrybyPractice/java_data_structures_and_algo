/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package LinkedList;

import org.junit.Test;


import java.util.ArrayList;

import static org.junit.Assert.*;

public class AppTest {

    String one = "one";
    String two = "two";
    String three = "three";
    String four = "four";

    @Test
    public void testLinkedListHead() {
        LinkedList testList = new LinkedList(one);

        assertEquals(testList.head.reference, null);
        assertEquals(testList.head.value, one);
    }

    @Test
    public void testInsert() {
        LinkedList testList = new LinkedList(one);
        System.out.println(testList.includes(one));
        Object endOfList = testList.head;

        testList.insert(two);

        assertEquals(testList.head.reference, endOfList);
        assertEquals(testList.head.value, two);

        testList.insert(three);

        assertEquals(testList.head.value, three);
        assertEquals(testList.head.reference.reference.value, one);
    }

    @Test
    public void testIncludes() {
        LinkedList testList = new LinkedList(one);
        testList.insert(two);
        testList.insert(three);
        testList.insert(four);

        assertTrue(testList.includes(one));
        assertFalse(testList.includes("Seven"));
    }

    @Test
    public void testPrint() {
        LinkedList testList = new LinkedList(one);
        testList.insert(two);
        testList.insert(three);
        testList.insert(four);

        testList.print();

        ArrayList<String> expectedReturn = new ArrayList<>();
        expectedReturn.add(four);
        expectedReturn.add(three);
        expectedReturn.add(two);
        expectedReturn.add(one);

        assertEquals(testList.print(), expectedReturn);

    }
}
