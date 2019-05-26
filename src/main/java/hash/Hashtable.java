package hash;

import linkedlist.LinkedList;
import linkedlist.NodeConstructor;

public class Hashtable {

    private static LinkedList[] buckets = new LinkedList[1024];


    public static class KeyValuePair {

        public static String key;
        public static String value;
    }


    /***
     * When first setting up a hash table, it is imperative that you run .initializeHashTable on it. This initializes all
     * of the linked lists and none of the methods involving accessing them will run if this has not been done.
     */
    public void initializeHashTable() {
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new LinkedList<KeyValuePair>();
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
        System.out.println(index + key + value);
        buckets[index].append(keyValuePair);
    }

    //get
    public KeyValuePair get(String inputKey) {
        KeyValuePair returnValue = new KeyValuePair();
        //accept a key, calculate the hash of the key,use modulus to convert the hash into an array index
        int index = findIndex(inputKey);

        //use the array index to access the short LinkedList representing a bucket

        if (contains(inputKey)) {
            NodeConstructor current = buckets[index].head;
            //search through the bucket looking for a node with a key/value pair that matches the key you were given
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

    //contains
    public boolean contains(String key) {

        int index = findIndex(key);

        NodeConstructor current = buckets[index].head;

        boolean inThisList = false;

        while ((current != null) && (inThisList == false)) {
            if (current.keyValuePair.key != key) {
                current = current.reference;
            } else if (current.keyValuePair.key == key) {
                inThisList = true;
            }
        }
        return inThisList;
    }


    //TODO: add load factor recognition and growth
}
