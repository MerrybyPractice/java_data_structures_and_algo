package hash;

import org.junit.Test;

import static hash.BasicHash.hash;
import static org.junit.Assert.*;

public class BasicHashTest {

    @Test
    public void hashTest() {
        int testHash = hash("test");
        int testHash2 = hash("test");
        int capitolHash = hash("Test");
        int emptyHash = hash("");
        int spacedHash = hash("this string has spaces");
        int characterHash = hash("+€$+");
        int numberHash = hash("7357");

        assertEquals("Basic Hash failed happy path", 156291440, testHash);
        assertNotEquals("Basic Hash is ignoring Capitalization", testHash, capitolHash);
        assertEquals("Basic Hash Failed on Empty String", 1, emptyHash);
        assertEquals("Basic Hash failed on spaces", -2147483648, spacedHash);
        assertEquals("Basic Hash failed on characters", 556741296, characterHash);
        assertEquals("Basic Hash failed on numbers", 8176575, numberHash);
        assertEquals("Identical Keys did not produce an identical hash", testHash, testHash2);
    }
}