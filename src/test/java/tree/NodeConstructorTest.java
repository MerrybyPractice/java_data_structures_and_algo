package tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class NodeConstructorTest {
    @Test
    public void testNodeConstructor() {
        NodeConstructor test = new NodeConstructor(1);

        assertEquals(1, test.value);
        assertNull(test.leftChild);
        assertNull(test.rightChild);
    }
}