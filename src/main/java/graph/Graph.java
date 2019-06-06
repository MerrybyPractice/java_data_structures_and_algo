package graph;

import com.sun.istack.internal.Nullable;
import hash.Hashtable;

import java.util.ArrayList;
import java.util.LinkedList;

public class Graph {

    //adjacency list

    private ArrayList<LinkedList> adjacencyList = new ArrayList<>();

    public void setAdjacencyList(ArrayList<LinkedList> adjacencyList) {
        this.adjacencyList = adjacencyList;
    }
    //AddNode()

    public int addNode(String value) {
        LinkedList node = new LinkedList();
        node.add(value);
        getAdjacencyList().add(node);
        return getAdjacencyList().indexOf(node);
    }

    //AddEdge()
    public String addEdge(@Nullable int weight, int index1, int index2) {
        if ((getAdjacencyList().get(index1).size() > 0) && (getAdjacencyList().get(index2).size() > 0)) {

            LinkedList linkedList = getAdjacencyList().get(index1);
            Hashtable.KeyValuePair kvp = new Hashtable.KeyValuePair(index2, weight);
            linkedList.addLast(kvp);

            return "Edge successfully added";

        } else {
            return null;
        }
    }

    //GetNodes()
    public ArrayList getNodes() {

        ArrayList returnList = new ArrayList();

        if (getAdjacencyList().size() > 0) {


            for (LinkedList list :
                    getAdjacencyList()) {
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
    public ArrayList getNeighbors(String value) {

        ArrayList returnList = new ArrayList();

        int index;


        for (LinkedList list : getAdjacencyList()) {

            if (list.getFirst().toString().equals(value)) {
                index = getAdjacencyList().indexOf(list);

                try {
                    LinkedList userNode = getAdjacencyList().get(index);

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
    public @javax.annotation.Nullable
    Integer getSize() {
        if (getAdjacencyList().size() > 0) {
            return getAdjacencyList().size();
        } else {
            return null;
        }
    }

    public ArrayList<LinkedList> getAdjacencyList() {
        return adjacencyList;
    }
}

