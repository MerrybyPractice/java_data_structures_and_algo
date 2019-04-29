package stacksandqueues;

public class Stack<Generic> {
    public NodeConstructor<Generic> top;

    public Stack() {
        top = null;

    }

    public void push(Generic value) {
        this.top = new NodeConstructor<>(value, this.top);
    }

    public NodeConstructor<Generic> pop() {
        NodeConstructor returnValue = this.top;
        this.top = top.reference;
        return returnValue;
    }

    public Generic peek() {
        return top.value;
    }
}
