package stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {
    //enqueue
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
    //enqueue multiple items
    //dequeue the expected value
    //peek
    //empty a queue after multiple dequeue's
    //instantiate an empty queue

}