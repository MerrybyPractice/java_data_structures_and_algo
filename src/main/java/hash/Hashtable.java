package hash;

import linkedlist.LinkedList;
import linkedlist.NodeConstructor;

/***
 *
 */
public class Hashtable {

    private static LinkedList[] buckets = new LinkedList[1024];

    public static class KeyValuePair {
        public static String key;
        public static String value;
    }

    public int findIndex(String key) {
        //accept Key, calculate hash of key
        int hash = BasicHash.hash(key);

        //convert key to index
        return hash % buckets.length;

    }

    //add
    public void add(String key, String value) {

        int index = findIndex(key);

        //store key with value by appending both to end of linked list at that bucket

        //creating a key value pair object
        KeyValuePair keyValuePair = new KeyValuePair();
        keyValuePair.key = key;
        keyValuePair.value = value;

        //store the pair in the array at the proper given index
        buckets[index].append(keyValuePair);
    }

    //get
    public String get(String inputKey) {
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

        return returnValue.toString();
    }

    //contains
    public boolean contains(String key) {

        int index = findIndex(key);

        return buckets[index].includes(KeyValuePair.key);
    }


    //TODO: add load factor recognition and growth
}
