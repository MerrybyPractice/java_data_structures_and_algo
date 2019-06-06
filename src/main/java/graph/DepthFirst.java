package graph;

import hash.Hashtable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class DepthFirst extends Graph {
    HashSet returnCollection = new HashSet();


    public HashSet depthFirst(ArrayList<LinkedList> adjacencyList, Queue tracking, HashSet<String> returnCollection) {

        LinkedList firstNode = adjacencyList.get(0);
        String firstValue = (String) firstNode.getFirst();

        tracking.add(firstValue);
        inOrderTraversal(firstNode, tracking);

        if (tracking.peek() == null) {
            return returnCollection;
        } else {

            int nextList = adjacencyList.indexOf(tracking.remove());
            LinkedList nextNode = adjacencyList.get(nextList);
            inOrderTraversal(nextNode, tracking);
        }
        return returnCollection;
    }

    protected Queue inOrderTraversal(LinkedList node, Queue tracking) {

        for (Object edge : node) {
            if (returnCollection.contains(edge)) {
                continue;
            } else {
                returnCollection.add(edge);
                if (edge.getClass().equals(Hashtable.KeyValuePair.class)) {
                    Hashtable.KeyValuePair kvpEdge = (Hashtable.KeyValuePair) edge;

                    tracking.add(((Hashtable.KeyValuePair) edge).key);
                } else {
                    tracking.add(edge);
                }
            }
        }
        return tracking;
    }

}
