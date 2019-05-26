package hash;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HashtableTest {


    Hashtable testHashtable = new hash.Hashtable();

    @Before
    public void setUp() {
        testHashtable.initializeHashTable();
        testHashtable.add("Test", "Test String");
        testHashtable.add("Hash", "Table");
        testHashtable.add("Linked", "List");
    }

    @Test
    public void findIndexTest() {
        int testIndex = testHashtable.findIndex("Test");
        int testLowerIndex = testHashtable.findIndex("test");
        int testEmptyIndex = testHashtable.findIndex("");

        assertEquals("Find Index failed happy path", 1008, testIndex);
        assertNotEquals("If basic hash is not failing on capitols, find index is creating excessive collisions", testIndex, testLowerIndex);
        assertEquals(1, testEmptyIndex);
        assertNotEquals(testEmptyIndex, testIndex, testLowerIndex);
    }

    @Test
    public void add() {

        testHashtable.add("Testing", "basic functionality of the add method");
        System.out.println(testHashtable.get("Testing"));

        assertNotNull(testHashtable.get("Testing"));
    }

    @Test
    public void get() {
        Hashtable.KeyValuePair kvp = testHashtable.get("Test");

        String testKey = kvp.key;
        String testValue = kvp.value;

        assertEquals("Key is Wrong", "Test", testKey);
        assertEquals("Value is Wrong", "Test String", testValue);

    }

    @Test
    public void contains() {

        assertTrue(testHashtable.contains("Test"));
        assertTrue(testHashtable.contains("Hash"));
        assertTrue(testHashtable.contains("Linked"));
    }
}