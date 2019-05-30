package hash;

import javax.annotation.Nullable;

public class LinkedList {

    public class Node {

        public Hashtable.KeyValuePair keyValuePair;
        public Node reference;

        public Node(Hashtable.KeyValuePair keyValuePair, @Nullable Node reference) {
            this.keyValuePair = keyValuePair;
            this.reference = reference;

        }

    }

    private Node head;

    public Node getHead() {
        return head;
    }


    public LinkedList() {
        head = null;
    }

    public void insert(Hashtable.KeyValuePair keyValuePair) {
        Node current = head;
        this.head = new Node(keyValuePair, current);
    }

    public boolean includes(String key) {
        Node current = this.head;

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

    public boolean includes(int key) {
        Node current = this.head;

        boolean inThisList = false;

        while ((current != null) && (inThisList == false)) {
            if (current.keyValuePair.intKey != key) {
                current = current.reference;
            } else if (current.keyValuePair.intKey == key) {
                inThisList = true;
            }
        }

        return inThisList;
    }
}
