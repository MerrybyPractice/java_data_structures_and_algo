package stacksandqueues;

public class Queue<Generic> {
    public NodeConstructor<Generic> front;
    public NodeConstructor<Generic> rear;

    public Queue() {
        rear = new NodeConstructor(null, null);
        front = new NodeConstructor(null, this.rear);

    }

    public void enqueue(Generic value) {
        rear = new NodeConstructor(value, this.rear);

    }

    public Generic dequeue() {
        NodeConstructor<Generic> returnValue = this.front;
        this.front = front.reference;
        return returnValue.value;
    }

    public Generic peek() {
        return this.front.value;
    }
}
