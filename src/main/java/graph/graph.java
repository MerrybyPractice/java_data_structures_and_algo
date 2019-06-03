package graph;

import com.sun.istack.internal.Nullable;
import hash.Hashtable;

import java.util.ArrayList;
import java.util.LinkedList;

/*
 *   node --> attached to node --> attached to node
 *   each linked list represents one node
 * */

public class graph {

    //adjacency list


    public static ArrayList<LinkedList> adjacencyList = new ArrayList<>();

    public static void setAdjacencyList(ArrayList<LinkedList> adjacencyList) {
        graph.adjacencyList = adjacencyList;
    }
    //AddNode()

    public static int addNode(String value) {
        LinkedList node = new LinkedList();
        node.add(value);
        adjacencyList.add(node);
        return adjacencyList.indexOf(node);
    }

    //AddEdge()
    public static String addEdge(@Nullable int weight, int index1, int index2) {
        if ((adjacencyList.get(index1).size() > 0) && (adjacencyList.get(index2).size() > 0)) {

            LinkedList linkedList = adjacencyList.get(index1);
            Hashtable.KeyValuePair kvp = new Hashtable.KeyValuePair(index2, weight);
            linkedList.addLast(kvp);

            return "Edge successfully added";

        } else {
            return null;
        }
    }

    //GetNodes()
    public static ArrayList getNodes() {

        ArrayList returnList = new ArrayList();

        if (adjacencyList.size() > 0) {


            for (LinkedList list :
                    adjacencyList) {
                Object first = list.getFirst();
                returnList.add(first);
            }
        } else {

            returnList = null;
        }

        return returnList;
    }

    /**
     * @param value: A string indicating the value of the node
     * @return Array List - this method returns an array list of all found neighbours, and the weights of their connecting edges. If there are no neighbors found, the array list is set to null and returned.
     */

    //GetNeighbors()
    public static ArrayList getNeighbors(String value) {

        ArrayList returnList = new ArrayList();

        int index;


        for (LinkedList list : adjacencyList) {

            if (list.getFirst().toString().equals(value)) {
                index = adjacencyList.indexOf(list);

                try {
                    LinkedList userNode = adjacencyList.get(index);

                    for (Object element : userNode) {

                        returnList.add(element);
                    }

                } catch (ArrayIndexOutOfBoundsException | NullPointerException outOfBounds) {

                    returnList = null;
                }
                if (returnList.size() == 1) {
                    returnList = null;

                }
            }
        }
        return returnList;

    }

    //Size()s
    public static @javax.annotation.Nullable
    Integer getSize() {
        if (adjacencyList.size() > 0) {
            return adjacencyList.size();
        } else {
            return null;
        }
    }

}

