package stacksandqueues;

public class PseudoQueue<Generic> {
    protected Stack s1;
    protected Stack s2;

    public PseudoQueue() {
        this.s1 = new Stack();
        this.s2 = new Stack();
    }

    public void enqueue(Generic value) {
        s2.push(value);
    }

    public void dequeue() {

        while (s2.top != null) {
            NodeConstructor nextValue = s2.top.reference;
            s1.push(s2.top.value);
            s2.top = nextValue;
        }

        s1.pop();

        while (s1.top != null) {
            NodeConstructor nextValue = s1.top.reference;
            s2.push(s1.top.value);
            s1.top = nextValue;
        }
    }
}
