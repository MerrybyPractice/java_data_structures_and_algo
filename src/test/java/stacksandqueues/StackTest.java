package stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {

    //push multiple nodes on to stack
    @Test
    public void testPush() {
        Stack testStack = new Stack();
        testStack.push(1);
        testStack.push(2);
        testStack.push(3);


        assertEquals(3, testStack.top.value);
        assertEquals(1, testStack.top.reference.reference.value);
        assertNull(testStack.top.reference.reference.reference);
    }


    //pop off the stack, empty a stack via pops
    @Test
    public void testPop() {
        Stack testStack = new Stack();
        testStack.push(1);
        testStack.push(2);
        testStack.push(3);

        testStack.pop();

        assertEquals(2, testStack.top.value);
        assertEquals(2, testStack.pop().value);
        assertEquals(1, testStack.pop().value);
        assertNull(testStack.top);
    }


    // instantiate an empty stack
    @Test
    public void testInstantiateStack() {
        Stack emptyStack = new Stack();

        assertNull(emptyStack.top);
        try {
            assertNull(emptyStack.top.reference);
        } catch (Exception ex) {
            assertTrue(ex instanceof NullPointerException);
        }

    }
}