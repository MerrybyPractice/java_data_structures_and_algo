package graph;

import hash.Hashtable;

import java.util.LinkedList;

public class BreadthFirstGraph extends Graph {

    private java.util.Hashtable<String, String> returnTable = new java.util.Hashtable<>();

    public java.util.Hashtable breadthFirstGraph(String node, Graph thisGraph) {

        LinkedList search = findAdjacencyList(node, thisGraph);

        for (Object edge : search) {

            Hashtable.KeyValuePair edgeKVP = (Hashtable.KeyValuePair) edge;

            if (returnTable.contains(edgeKVP.key)) {
                returnTable.put(edgeKVP.key, edgeKVP.key);
            }
            breadthFirstGraph(edgeKVP.key, thisGraph);
        }

        return returnTable;
    }

    public LinkedList findAdjacencyList(String node, Graph thisGraph) {

        int idx = thisGraph.getAdjacencyList().indexOf(node);
        LinkedList search = thisGraph.getAdjacencyList().get(idx);

        return search;

    }

}
