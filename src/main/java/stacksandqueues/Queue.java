package stacksandqueues;

public class Queue<Generic> {
    public NodeConstructor<Generic> front;
    public NodeConstructor<Generic> rear;

    public Queue() {
        rear = null;
        front = null;
    }

    public void enqueue(Generic value) {
        NodeConstructor nodeAdded = new NodeConstructor(value, null);
        if (this.rear == null) {
            rear = nodeAdded;
        } else {
            rear.reference = nodeAdded;
            rear = nodeAdded;
        }

        if (this.front == null) {
            front = nodeAdded;
        }

    }

    public Generic dequeue() {
        NodeConstructor<Generic> returnValue = this.front;
        if (this.front.reference == null) {
            this.rear = null;
            this.front = null;
        } else {
            this.front = front.reference;
        }
        return returnValue.value;
    }

    public Generic peek() {
        return this.front.value;
    }
}
