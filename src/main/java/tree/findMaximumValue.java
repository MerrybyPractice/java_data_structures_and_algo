package tree;

import stacksandqueues.Queue;

public class findMaximumValue {

    public static int findMaximumValue(NodeConstructor root) {

        NodeConstructor current = root;
        NodeConstructor currentLargest = root;

        Queue<NodeConstructor> longestQueue = new Queue<>();
        longestQueue.enqueue(current);

        while (longestQueue.peek() != null) {

            int front = longestQueue.dequeue().value;

            if (current.leftChild != null) {
                longestQueue.enqueue(current.leftChild);
            }

            front = longestQueue.dequeue().value;

            if (front > currentLargest.value) {
                currentLargest.value = front;
            }

            if (current.rightChild != null) {
                longestQueue.enqueue(current.rightChild);
            }
        }

        return currentLargest.value;
    }
}
