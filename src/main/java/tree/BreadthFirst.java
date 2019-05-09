package tree;

import stacksandqueues.Queue;

import java.util.ArrayList;

public class BreadthFirst extends BinaryTree {

    public static ArrayList breadthFirst(NodeConstructor root) {
        Queue breadthQueue = new Queue();
        ArrayList breadthArray = new ArrayList();

        breadthQueue.enqueue(root);
        NodeConstructor front = root;

        try {
            while (breadthQueue.peek() != null) {

                front = (NodeConstructor) breadthQueue.dequeue();
                //System.out.println(front.value);
                breadthArray.add(front.value);

                if (front.leftChild != null) {
                    breadthQueue.enqueue(front.leftChild);
                }

                if (front.rightChild != null) {
                    breadthQueue.enqueue(front.rightChild);
                }
            }

        } catch (NullPointerException E) {

            System.out.println("We have finished traversing the tree");
        }
        return breadthArray;
    }
}
