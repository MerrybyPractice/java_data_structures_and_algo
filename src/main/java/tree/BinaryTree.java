package tree;

import java.util.ArrayList;

public class BinaryTree {
    public NodeConstructor root = null;
    public NodeConstructor current;

    public ArrayList preOrderTraversal(NodeConstructor current, ArrayList preOrderArray) {

        preOrderArray.add(current.value);

        if (current.leftChild != null) {
            preOrderTraversal(current.leftChild, preOrderArray);
        }

        if (current.rightChild != null) {
            preOrderTraversal(current.rightChild, preOrderArray);
        }

        return preOrderArray;
    }

    //inOrder traversal

    public static ArrayList inOrderTraversal(NodeConstructor current, ArrayList inOrderArray) {

        if (current.leftChild != null) {
            inOrderTraversal(current.leftChild, inOrderArray);
        }

        inOrderArray.add(current.value);

        if (current.rightChild != null) {
            inOrderTraversal(current.rightChild, inOrderArray);
        }

        return inOrderArray;
    }

    //postOrder traversal

    public ArrayList postOrderTraversal(NodeConstructor current, ArrayList postOrderArray) {

        if (current.leftChild != null) {
            postOrderTraversal(current.leftChild, postOrderArray);
        }

        if (current.rightChild != null) {
            postOrderTraversal(current.rightChild, postOrderArray);
        }

        postOrderArray.add(current.value);
        return postOrderArray;
    }
}
