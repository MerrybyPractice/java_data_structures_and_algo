package graph;

import hash.Hashtable;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;

import static org.junit.Assert.*;

public class graphTest {

    //Node can be successfully added to the Graph

    @Test
    public void testAddNode() {

        graph.Graph test = new graph.Graph();

        assertEquals("Adjacency List has size before nodes are added", 0, test.getAdjacencyList().size());

        test.addNode("One");

        assertEquals("Adjacency List has wrong size after adding a single node", 1, test.getAdjacencyList().size());
        assertEquals("First Value of first node Adjacency List is incorrect", "One", (test.getAdjacencyList().get(0).getFirst()));

    }


    //An edge can be successfully added to the Graph

    @Test
    public void testAddEdge() {
        graph.Graph test = new graph.Graph();

        ArrayList<LinkedList> adjacencyList = new ArrayList<>();
        test.setAdjacencyList(adjacencyList);

        test.addNode("One");

        assertEquals("Node One has an Incorrect length", 1, test.getAdjacencyList().get(0).size());

        test.addNode("Two");

        test.addEdge(3, 0, 1);

        assertEquals("After adding an edge, Node One has an incorrect length", 2, test.getAdjacencyList().get(0).size());

        Hashtable.KeyValuePair keyValuePair = new Hashtable.KeyValuePair(1, 3);

        Object node = test.getAdjacencyList().get(0).getLast();

        assertEquals("The Adjacency List is not handling KeyValuePairs correctly", keyValuePair.getClass(), node.getClass());

    }
    //A collection of all nodes can be properly retrieved from the Graph

    @Test
    public void testGetNodes() {

        graph.Graph test = new graph.Graph();

        test.addNode("One");
        test.addNode("Three");
        test.addNode(" ");

        ArrayList nodeList = test.getNodes();

        assertEquals("Node Search is not coming back with a correct first value", "One", nodeList.get(0));
        assertEquals("Node Search is not coming back with a correct second value", "Three", nodeList.get(1));
        assertEquals("Node Search is not coming back with a correct third value", " ", nodeList.get(2));

        assertEquals("Get Nodes is not returning the correct size", 3, nodeList.size());

        test.addEdge(4, 0, 2);

        //proves that this only returns the nodes and is not impacted by edges
        assertEquals("Adding an edge is impacting get nodes", 3, nodeList.size());
    }

    //All appropriate neighbors can be retrieved from the Graph
    @Test
    public void testGetNeighbors() {

        graph.Graph test = new graph.Graph();

        test.addNode("One");
        test.addNode("Two");
        test.addNode("Three");

        assertEquals("Adjacency List is returning incorrect value for first node at index 1", "Two", test.getAdjacencyList().get(1).getFirst());

        assertNull(test.getNeighbors("Two"));

        test.addEdge(2, 1, 0);
        test.addEdge(2, 1, 2);


        assertEquals("Get Neighbors is not returning correctly", 3, test.getNeighbors("Two").size());
        assertEquals("Get Neighbors is not handling key value pairs correctly", test.getNeighbors("Two").get(1).getClass(), test.getNeighbors("Two").get(1).getClass());
    }

    //Neighbors are returned with the weight between nodes included
    @Test
    public void testGetNeighborWeight() {

        graph.Graph test = new graph.Graph();

        test.addNode("One");
        test.addNode("Two");
        test.addNode("Three");

        test.addEdge(2, 0, 1);
        test.addEdge(3, 0, 2);
        test.addEdge(4, 1, 0);
        test.addEdge(5, 1, 2);
        test.addEdge(1, 2, 0);
        test.addEdge(0, 2, 1);

        Hashtable.KeyValuePair oneToTwo = (Hashtable.KeyValuePair) test.getNeighbors("One").get(1);
        Hashtable.KeyValuePair oneToThree = (Hashtable.KeyValuePair) test.getNeighbors("One").get(2);
        Hashtable.KeyValuePair twoToOne = (Hashtable.KeyValuePair) test.getNeighbors("Two").get(1);
        Hashtable.KeyValuePair twoToThree = (Hashtable.KeyValuePair) test.getNeighbors("Two").get(2);
        Hashtable.KeyValuePair threeToOne = (Hashtable.KeyValuePair) test.getNeighbors("Three").get(1);
        Hashtable.KeyValuePair threeToTwo = (Hashtable.KeyValuePair) test.getNeighbors("Three").get(2);


        assertEquals("Weight is not coming back correctly from getNeighbors", 2, oneToTwo.intValue);
        assertEquals("Weight is not coming back correctly from getNeighbors", 3, oneToThree.intValue);
        assertEquals("Weight is not coming back correctly from getNeighbors", 4, twoToOne.intValue);
        assertEquals("Weight is not coming back correctly from getNeighbors", 5, twoToThree.intValue);
        assertEquals("Weight is not coming back correctly from getNeighbors", 1, threeToOne.intValue);
        assertEquals("Weight is not coming back correctly from getNeighbors", 0, threeToTwo.intValue);
    }

    //The proper size is returned, representing the number of nodes in the Graph

    @Test
    public void testGetSize() {

        graph.Graph test = new graph.Graph();

        test.addNode("One");
        test.addNode("Two");
        test.addNode("Three");
        test.addNode("Four");
        test.addNode("Five");

        Integer five = 5;
        Integer six = 6;

        assertEquals("Get Size is not returning correctly", five, test.getSize());

        test.addNode("Six");

        assertEquals("Get Size is not returning correctly", six, test.getSize());

        test.addEdge(0, 1, 4);

        assertEquals("Adding an edge is impacting get size", six, test.getSize());
    }

    //A Graph with only one node and edge can be properly returned
    @Test
    public void testOneNodeOneEdge() {

        graph.Graph test = new graph.Graph();

        test.addNode("Only");
        test.addEdge(5, 0, 0);
        Hashtable.KeyValuePair only = (Hashtable.KeyValuePair) test.getAdjacencyList().get(0).getLast();

        Integer one = 1;

        assertEquals("Is not returning a size of one correctly", one, test.getSize());
        assertNotNull("Is not retuning a single neighbor correctly", test.getNeighbors("Only"));
        assertEquals("Is not returning a single connection", 0, only.intKey);
        assertEquals("Is not returning a single weight", 5, only.intValue);
        assertEquals("Get nodes is not handling a single node well", 1, test.getNodes().size());
    }

    //An empty Graph properly returns null

    @Test
    public void testEmptyGraph() {

        graph.Graph test = new graph.Graph();

        assertNull("get size is not handling null", test.getSize());
        assertNull("get nodes is not handling null", test.getNodes());
        assertEquals("Adjacency List has length when it should be empty", 0, test.getAdjacencyList().size());
    }


}