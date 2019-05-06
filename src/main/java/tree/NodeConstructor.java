package tree;


public class NodeConstructor {

    public int value;
    protected NodeConstructor leftChild = null;
    protected NodeConstructor rightChild = null;

    public NodeConstructor(int value) {
        this.value = value;
    }
}
