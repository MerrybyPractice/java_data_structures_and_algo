package tree;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

import java.util.ArrayList;

public class BinaryTree<T> {
    public NodeConstructor<T> root;
    public NodeConstructor<T> current;

    /*
     * if if not root, create root
     * current no left, current.left = nodeconstructor left
     * current no right, current.right = nodeconstructor right
     * else traverse left, then right - balanced
     *
     * check depth, new node goes on shallow side
     *
     * */

    public ArrayList<T> preOrderTraversal(NodeConstructor<T> current, ArrayList<T> preOrderArray) {

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

    public ArrayList<T> inOrderTraversal(NodeConstructor<T> current, ArrayList<T> inOrderArray) {

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

    public ArrayList<T> postOrderTraversal(NodeConstructor<T> current, ArrayList<T> postOrderArray) {

        if (current.leftChild != null) {
            postOrderTraversal(current.leftChild, postOrderArray);
        }

        if (current.rightChild != null) {
            postOrderTraversal(current.rightChild, postOrderArray);
        }

        return postOrderArray;
    }
}
