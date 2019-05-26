package linkedlist;

import com.sun.istack.internal.*;
import hash.Hashtable;

public class NodeConstructor<generic> {

    public NodeConstructor reference;
    public generic value;
    public Hashtable.KeyValuePair keyValuePair;

    /***
     * This is the base generic constructor for a NodeConstructor in the Linked List package. It is suitable for most
     * things. Other more specialized versions are available - written for their specific use case.
     * @param value: the user passed in object to be stored
     * @param reference: the generated pointer to reference the next node in the list.
     */
    public NodeConstructor(generic value, @Nullable NodeConstructor reference) {

        this.value = value;
        this.reference = reference;
    }

    /***
     * This constructor is designed for use with the hash.Hashtable class and stores a KeyValue pair object found in that
     * package.
     * @param keyValuePair: a wrapper for a String key and a String value.
     * @param reference:the generated pointer to reference the next node in the list.
     */
    public NodeConstructor(Hashtable.KeyValuePair keyValuePair, @Nullable NodeConstructor reference) {

        this.keyValuePair = keyValuePair;
        this.reference = reference;
    }
}
