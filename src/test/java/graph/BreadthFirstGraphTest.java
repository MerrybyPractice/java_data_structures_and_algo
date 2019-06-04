package graph;

import hash.LinkedList;
import org.junit.Test;

import static org.junit.Assert.*;

public class BreadthFirstGraphTest {

    @Test
    public void testFindAdjacencyList() {
        BreadthFirstGraph test = new BreadthFirstGraph();
        test.addNode("One");
        test.addNode("Two");
        LinkedList equals = new LinkedList();

        test.findAdjacencyList("One", test);

    }


}