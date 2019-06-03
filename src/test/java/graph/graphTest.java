package graph;

import hash.Hashtable;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;

import static org.junit.Assert.*;

public class graphTest {

    //Node can be successfully added to the graph

    @Test
    public void testAddNode() {

        ArrayList<LinkedList> adjacencyList = new ArrayList<>();
        graph.setAdjacencyList(adjacencyList);

        assertEquals(0, graph.adjacencyList.size());

        graph.addNode("One");

        assertEquals(1, graph.adjacencyList.size());
        assertEquals("One", (graph.adjacencyList.get(0).getFirst()));

    }


    //An edge can be successfully added to the graph

    @Test
    public void testAddEdge() {

        ArrayList<LinkedList> adjacencyList = new ArrayList<>();
        graph.setAdjacencyList(adjacencyList);

        graph.addNode("One");

        assertEquals(1, graph.adjacencyList.get(0).size());

        graph.addNode("Two");

        graph.addEdge(3, 0, 1);

        assertEquals(2, graph.adjacencyList.get(0).size());

        Hashtable.KeyValuePair keyValuePair = new Hashtable.KeyValuePair(1, 3);

        Object node = graph.adjacencyList.get(0).getLast();

        assertEquals(keyValuePair.getClass(), node.getClass());

    }
    //A collection of all nodes can be properly retrieved from the graph

    @Test
    public void testGetNodes() {

        ArrayList<LinkedList> adjacencyList = new ArrayList<>();
        graph.setAdjacencyList(adjacencyList);

        graph.addNode("One");
        graph.addNode("Three");
        graph.addNode(" ");

        ArrayList nodeList = graph.getNodes();

        assertEquals("One", nodeList.get(0));
        assertEquals("Three", nodeList.get(1));
        assertEquals(" ", nodeList.get(2));

        assertEquals(3, nodeList.size());

        graph.addEdge(4, 0, 2);

        //proves that this only returns the nodes and is not impacted by edges
        assertEquals(3, nodeList.size());
    }

    //All appropriate neighbors can be retrieved from the graph
    @Test
    public void testGetNeighbors() {

        ArrayList<LinkedList> adjacencyList = new ArrayList<>();
        graph.setAdjacencyList(adjacencyList);

        graph.addNode("One");
        graph.addNode("Two");
        graph.addNode("Three");

        assertEquals("Two", graph.adjacencyList.get(1).getFirst());

        assertNull(graph.getNeighbors("Two"));

        graph.addEdge(2, 1, 0);
        graph.addEdge(2, 1, 2);


        assertEquals(3, graph.getNeighbors("Two").size());
        assertEquals(graph.getNeighbors("Two").get(1).getClass(), graph.getNeighbors("Two").get(1).getClass());
    }

    //Neighbors are returned with the weight between nodes included
    @Test
    public void testGetNeighborWeight() {

        ArrayList<LinkedList> adjacencyList = new ArrayList<>();
        graph.setAdjacencyList(adjacencyList);

        graph.addNode("One");
        graph.addNode("Two");
        graph.addNode("Three");

        graph.addEdge(2, 0, 1);
        graph.addEdge(3, 0, 2);
        graph.addEdge(4, 1, 0);
        graph.addEdge(5, 1, 2);
        graph.addEdge(1, 2, 0);
        graph.addEdge(0, 2, 1);

        Hashtable.KeyValuePair oneToTwo = (Hashtable.KeyValuePair) graph.getNeighbors("One").get(1);
        Hashtable.KeyValuePair oneToThree = (Hashtable.KeyValuePair) graph.getNeighbors("One").get(2);
        Hashtable.KeyValuePair twoToOne = (Hashtable.KeyValuePair) graph.getNeighbors("Two").get(1);
        Hashtable.KeyValuePair twoToThree = (Hashtable.KeyValuePair) graph.getNeighbors("Two").get(2);
        Hashtable.KeyValuePair threeToOne = (Hashtable.KeyValuePair) graph.getNeighbors("Three").get(1);
        Hashtable.KeyValuePair threeToTwo = (Hashtable.KeyValuePair) graph.getNeighbors("Three").get(2);


        assertEquals(2, oneToTwo.intValue);
        assertEquals(3, oneToThree.intValue);
        assertEquals(4, twoToOne.intValue);
        assertEquals(5, twoToThree.intValue);
        assertEquals(1, threeToOne.intValue);
        assertEquals(0, threeToTwo.intValue);
    }

    //The proper size is returned, representing the number of nodes in the graph

    @Test
    public void testGetSize() {
        ArrayList<LinkedList> adjacencyList = new ArrayList<>();
        graph.setAdjacencyList(adjacencyList);

        graph.addNode("One");
        graph.addNode("Two");
        graph.addNode("Three");
        graph.addNode("Four");
        graph.addNode("Five");

        Integer five = 5;
        Integer six = 6;

        assertEquals(five, graph.getSize());

        graph.addNode("Six");

        assertEquals(six, graph.getSize());

        //proves that edges do not impact size
        graph.addEdge(0, 1, 4);

        assertEquals(six, graph.getSize());
    }

    //A graph with only one node and edge can be properly returned
    @Test
    public void testOneNodeOneEdge() {
        ArrayList<LinkedList> adjacencyList = new ArrayList<>();
        graph.setAdjacencyList(adjacencyList);

        graph.addNode("Only");
        graph.addEdge(5, 0, 0);
        Hashtable.KeyValuePair only = (Hashtable.KeyValuePair) adjacencyList.get(0).getLast();

        Integer one = 1;

        assertEquals(one, graph.getSize());
        assertNotNull(graph.getNeighbors("Only"));
        assertEquals(0, only.intKey);
        assertEquals(5, only.intValue);
        assertEquals(1, graph.getNodes().size());
    }

    //An empty graph properly returns null

    @Test
    public void testEmptyGraph() {
        ArrayList<LinkedList> adjacencyList = new ArrayList<>();
        graph.setAdjacencyList(adjacencyList);

        assertNull(graph.getSize());
        assertNull(graph.getNodes());
        assertEquals(0, adjacencyList.size());
    }


}