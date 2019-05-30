package hash;


import tree.NodeConstructor;

import java.util.ArrayList;

public class TreeIntersection {

    public ArrayList treeIntersection(NodeConstructor node1, NodeConstructor node2) {
        Hashtable tracking = new Hashtable();
        ArrayList<Integer> returnArray = new ArrayList<>();

        ArrayList<NodeConstructor> inOrderArray = new ArrayList<>();
        ArrayList<NodeConstructor> inOrderArray2 = new ArrayList<>();

        tree.BinaryTree.inOrderTraversal(node1, inOrderArray);
        for (NodeConstructor node : inOrderArray) {
            tracking.add(node.value, node.value);
        }

        tree.BinaryTree.inOrderTraversal(node2, inOrderArray2);
        for (NodeConstructor node : inOrderArray2) {
            if (tracking.contains(node.value)) {
                returnArray.add(node.value);
            }
        }

        return returnArray;
    }
}
