package hash;

import com.sun.tools.javac.util.GraphUtils;
import linkedlist.NodeConstructor;

public class Hashtable {

    private hash.LinkedList[] buckets = new hash.LinkedList[1024];


    public static class KeyValuePair {

        public String key;
        public String value;

        public int intKey;
        public int intValue;


        public KeyValuePair() {
            this.key = key;
            this.value = value;
        }

        public KeyValuePair(int intKey, int intValue) {
            this.intKey = intKey;
            this.intValue = intValue;
        }
    }


    /***
     * When first setting up a hash table, it is imperative that you run .initializeHashTable on it. This initializes all
     * of the linked lists and none of the methods involving accessing them will run if this has not been done.
     */
    public void initializeHashTable() {
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new LinkedList();
        }
    }

    /***
     * Utilizes the basic hash to create a hashed int and modulo's that against the size of the hash table (currently
     * set at 1024) to produce an index.
     *
     * @param key - String
     * @return int index to store the key value pair at.
     */
    public int findIndex(String key) {
        //accept Key, calculate hash of key
        int hash = BasicHash.hash(key);

        //convert key to index
        hash %= buckets.length;

        return Math.abs(hash);
    }

    public int findIndex(int key) {

        int hash = BasicHash.hash(key);

        hash %= buckets.length;

        return Math.abs(hash);
    }

    /***
     *
     * A method to add items to the Hash Table. It takes in:
     *
     * @param key - the string key used to find values in the hash table: is transformed in  to the "Key" in the key value pair
     * @param value - the string value stored based on a hashed key: is transformed in to the "Value" in the key value pair
     *
     * In the function the key and value are joined in a KeyValue pair object.
     * The Key is hashed and transformed into an index
     * The full key value pair is appended to the bucket at that index of the HashMap.
     *
     */
    //add
    public void add(String key, String value) {

        int index = findIndex(key);
        //store key with value by appending both to end of linked list at that bucket

        //creating a key value pair object
        KeyValuePair keyValuePair = new KeyValuePair();
        keyValuePair.key = key;
        keyValuePair.value = value;

        //store the pair in the array at the proper given index
        //TODO: check for null linked list, render init obsolete
        buckets[index].insert(keyValuePair);
    }

    public void add(int key, int value) {

        int index = findIndex(key);

        KeyValuePair keyValuePair = new KeyValuePair(key, value);

        buckets[index].insert(keyValuePair);


    }

    //get
    public KeyValuePair get(String inputKey) {
        KeyValuePair returnValue = new KeyValuePair();
        //accept a key, calculate the hash of the key,use modulus to convert the hash into an array index
        int index = findIndex(inputKey);

        //use the array index to access the short LinkedList representing a bucket

        if (buckets[index].includes(inputKey)) {
            hash.LinkedList.Node current = buckets[index].getHead();

            if (current.keyValuePair.key != inputKey) {
                current = current.reference;
            } else if (current.keyValuePair.key.equals(inputKey)) {
                returnValue = current.keyValuePair;
            }
        } else {
            //TODO: more robust not found operation.
            returnValue.key = "key not found";
            returnValue.value = "please try again with a different key";
        }

        return returnValue;
    }

    public KeyValuePair get(int inputKey) {
        int index = findIndex(inputKey);
        KeyValuePair returnValue = new KeyValuePair(0, 0);

        //TODO: add ints to linked list
        if (buckets[index].includes(inputKey)) {
            hash.LinkedList.Node current = buckets[index].getHead();

            if (current.keyValuePair.intKey != inputKey) {
                current = current.reference;
            } else if (current.keyValuePair.intKey == inputKey) {
                returnValue = current.keyValuePair;
            }
        } else {
            returnValue.key = "key not found";
            returnValue.value = "please try again with a different key";
        }
        return returnValue;
    }


    //contains
    public boolean contains(String key) {

        int index = findIndex(key);

        LinkedList.Node current = buckets[index].getHead();

        while (current != null) {
            if (!current.keyValuePair.key.equals(key)) {
                current = current.reference;
            } else if (current.keyValuePair.key.equals(key)) {
                return true;
            }
        }
        return false;
    }

    public boolean contains(int key) {

        int index = findIndex(key);

        LinkedList.Node current = buckets[index].getHead();

        while (current != null) {

            if (!current.keyValuePair.key.equals(key)) {
                current = current.reference;
            } else if (current.keyValuePair.intKey == key) {
                return true;
            }
        }
        return false;
    }

    //TODO: add load factor recognition and growth
}
