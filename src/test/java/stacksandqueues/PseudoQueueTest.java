package stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;


public class PseudoQueueTest {
    //enqueue happy path
    @Test
    public void testEnqueue() {
        PseudoQueue<Integer> testPseudoQueue = new PseudoQueue();
        testPseudoQueue.enqueue(1);

        assertEquals(1, testPseudoQueue.s2.top.value);
        assertNull(testPseudoQueue.s1.top);

        testPseudoQueue.enqueue(2);
        assertEquals(2, testPseudoQueue.s2.top.value);
        assertEquals(1, testPseudoQueue.s2.top.reference.value);

    }
    
    //dequeue happy path
    @Test
    public void testDequeue() {
        PseudoQueue<Integer> testPseudoQueue = new PseudoQueue<>();
        testPseudoQueue.enqueue(1);
        testPseudoQueue.enqueue(2);
        testPseudoQueue.enqueue(3);

        testPseudoQueue.dequeue();

        assertEquals(3, testPseudoQueue.s2.top.value);
        assertEquals(2, testPseudoQueue.s2.top.reference.value);
        assertNull(testPseudoQueue.s2.top.reference.reference);
        assertNull(testPseudoQueue.s1.top);

        testPseudoQueue.dequeue();

        assertEquals(3, testPseudoQueue.s2.top.value);
        assertNull(testPseudoQueue.s2.top.reference);
        assertNull(testPseudoQueue.s1.top);

        testPseudoQueue.dequeue();

        assertNull(testPseudoQueue.s1.top);
        assertNull(testPseudoQueue.s2.top);
    }

    //dequeue expected failure
    @Test
    public void testPseudoDequeueFail() {
        PseudoQueue emptyQueue = new PseudoQueue();

        try {
            emptyQueue.dequeue();
        } catch (Exception ex) {
            assertTrue(ex instanceof NullPointerException);
        }

        assertNull(emptyQueue.s1.top);
        assertNull(emptyQueue.s2.top);

    }

}