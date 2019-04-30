package stacksandqueues;

public class PseudoQueue<Generic> {
    public Stack s1;
    public Stack s2;

    public NodeConstructor<Generic> front;
    public NodeConstructor<Generic> rear;

    public void PseudoQueue() {
        this.s1 = new Stack();
        this.s2 = new Stack();
        this.front = new NodeConstructor<>(null, null);
        this.rear = new NodeConstructor<>(null, null);
    }

    public void enqueue(Generic value) {
        NodeConstructor newNode;
        if (s1.top == null) {
            if (s2.top == null) {
                newNode = new NodeConstructor<>(value, null);
                s1.push(newNode);
                this.front = newNode;
                this.rear = newNode;
            } else if (s2 != null) {
                while (s2.top != null) {
                    NodeConstructor nextValue = s2.top.reference;
                    s1.push(s2.top);
                    s2.pop();
                    s2.top = nextValue;
                }

                s1.push(value);
                rear = s1.top;
            }
        } else if (s1.top != null) {
            if (s1.peek() == rear) {
                s1.push(value);
            } else {
                System.out.println("I am sorry, it seems like something has gone wrong.");
            }
        }
    }

    public void dequeue() {
        if (s2.top == null) {
            if (s1.top == null) {
                System.out.println("This appears to be an empty PseudoQueue. Would you like to Enqueue a value?");
                s2.pop();
            } else if (s1.top != null) {
                while (s1.top != null) {
                    NodeConstructor nextValue = s1.top.reference;
                    s2.push(s1.top);
                    s1.pop();
                    s1.top = nextValue;
                }
                NodeConstructor nextValue = s2.top.reference;
                s2.pop();
                s2.top = nextValue;
                front = s2.top;
            } else if (s2 != null) {
                if (s2.peek() == front) {
                    NodeConstructor nextValue = s2.top.reference;
                    s2.pop();
                    s2.top = nextValue;
                    front = s2.top;
                } else {
                    System.out.println("It seems as if something has gone wrong.");
                }
            }
        }
    }
}
