package tree;

public class NodeConstructor<T> {

    public T value;
    protected NodeConstructor leftChild;
    protected NodeConstructor rightChild;

    public NodeConstructor(T value, NodeConstructor leftChild, NodeConstructor rightChild) {
        this.value = value;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }
}
