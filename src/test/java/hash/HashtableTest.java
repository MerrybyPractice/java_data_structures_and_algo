package hash;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HashtableTest {


    Hashtable testHashtable = new hash.Hashtable();


    @Test
    public void findIndexTest() {
        Hashtable testHashtable = new hash.Hashtable();
        testHashtable.initializeHashTable();

        int testIndex = testHashtable.findIndex("Test");
        assertEquals("Find Index failed happy path", 368, testIndex);

        int testLowerIndex = testHashtable.findIndex("test");
        assertEquals(752, testLowerIndex);
        assertNotEquals("If basic hash is not failing on capitols, find index is creating excessive collisions", testIndex, testLowerIndex);

        int testEmptyIndex = testHashtable.findIndex("");
        assertEquals(599, testEmptyIndex);
        assertNotEquals(testEmptyIndex, testIndex);


    }

    @Test
    public void add() {
        Hashtable testHashtable = new hash.Hashtable();
        testHashtable.initializeHashTable();

        testHashtable.add("Testing", "basic functionality of the add method");
        assertNotNull(testHashtable.get("Testing"));
        assertEquals("Value not coming back correctly in add test", "basic functionality of the add method", testHashtable.get("Testing").value);

        testHashtable.add(" ", "Empty");
        assertEquals("Empty String Value is not comming back correctly in add test", "Empty", testHashtable.get(" ").value);

    }

    @Test
    public void get() {

        Hashtable testHashtable = new hash.Hashtable();
        testHashtable.initializeHashTable();
        testHashtable.add("Test", "Test String");

        Hashtable.KeyValuePair kvp = testHashtable.get("Test");

        String testKey = kvp.key;
        String testValue = kvp.value;

        assertEquals("Key is Wrong", "Test", testKey);
        assertEquals("Value is Wrong", "Test String", testValue);

    }

    @Test
    public void contains() {
        Hashtable testHashtable = new hash.Hashtable();
        testHashtable.initializeHashTable();

        testHashtable.add("Test", "Test String");
        assertTrue(testHashtable.contains("Test"));

        testHashtable.add("Hash", "Table");
        assertTrue(testHashtable.contains("Hash"));

        testHashtable.add(" ", "Empty String");
        assertTrue(testHashtable.contains(" "));
    }
}