package stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {
    //enqueue multiple items
    @Test
    public void testEnqueue() {
        Queue testQueue = new Queue();
        testQueue.enqueue(1);
        testQueue.enqueue(2);
        testQueue.enqueue(3);

        assertEquals(1, testQueue.front.value);
        assertEquals(3, testQueue.rear.value);
        assertNull(testQueue.rear.reference);
    }

    //dequeue the expected value, empty after multiple dequeues.
    @Test
    public void testDequeue() {
        Queue testQueue = new Queue();
        testQueue.enqueue(1);
        testQueue.enqueue(2);
        testQueue.enqueue(3);

        assertEquals(1, testQueue.dequeue());
        assertEquals(2, testQueue.front.value);
        assertEquals(2, testQueue.dequeue());
        assertEquals(3, testQueue.dequeue());
        assertNull(testQueue.front);
        assertNull(testQueue.rear);
    }

    //peek
    @Test
    public void testPeek() {
        Queue testQueue = new Queue();
        testQueue.enqueue(1);
        testQueue.enqueue(2);
        testQueue.enqueue(3);

        assertEquals(1, testQueue.peek());
        assertEquals(testQueue.front.value, testQueue.peek());
        assertNotEquals(testQueue.rear.value, testQueue.peek());

    }

    //instantiate an empty queue
    @Test
    public void testEmpty() {
        Queue emptyQueue = new Queue();

        assertEquals(null, emptyQueue.front);
        assertEquals(null, emptyQueue.rear);
        try {
            emptyQueue.peek();
        } catch (Exception ex) {
            assertTrue(ex instanceof NullPointerException);
        }
    }

}