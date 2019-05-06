package tree;

public class BinarySearchTree extends BinaryTree {

    public BinarySearchTree(Integer value) {

        if (root == null) {
            this.root = new NodeConstructor(value);
        }
    }

    public void add(int value) {

        if (root == null) {
            this.root = new NodeConstructor(value);
        } else {
            current = root;
            while (current.value != value) {
                if (value > current.value) {
                    if (current.rightChild == null) {
                        current.rightChild = new NodeConstructor(value);
                    } else {
                        current = current.rightChild;
                    }
                } else if (value < current.value) {
                    if (current.leftChild == null) {
                        current.leftChild = new NodeConstructor(value);
                    } else {
                        current = current.leftChild;
                    }
                }


            }
        }
    }


    public boolean contains(int value) {

        current = root;
        boolean returnStatement = false;

        if (current.value == value) {

            System.out.println("Made it to 40 " + current.value);
        }

        while (returnStatement == false) {
            if (current.value == value) {
                returnStatement = true;
            } else if (value > current.value) {
                if (current.rightChild != null) {
                    current = current.rightChild;
                } else if (current.rightChild == null) {
                    break;
                }

            } else if (value < current.value) {
                if (current.leftChild != null) {
                    current = current.leftChild;
                } else if (current.leftChild == null) {
                    break;
                }
            }
        }

        return returnStatement;
    }
}


