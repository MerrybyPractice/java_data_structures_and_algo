package LinkedList;

import java.util.ArrayList;
import java.util.List;

public class LinkedList<generic> {

    public NodeConstructor<generic> head;


    public LinkedList() {
        head = null;
    }

    public void insert(generic value) {

        this.head = new NodeConstructor(value, this.head);
    }

    public boolean includes(generic value) {
        NodeConstructor current = this.head;

        boolean inThisList = false;

        while ((current != null) && (inThisList == false)) {
            if (current.value != value) {
                current = current.reference;

            } else if (current.value == value) {
                inThisList = true;
            }
        }
        return inThisList;
    }

    public List print() {

        NodeConstructor<generic> current = this.head;

        ArrayList<generic> printList = new ArrayList<>();

        while (current != null) {
            printList.add(current.value);
            current = current.reference;
        }

        System.out.println(printList);
        return printList;
    }

    public void append(generic value) {

        NodeConstructor<generic> current = this.head;

        while (current.reference != null) {
            current = current.reference;
        }

        NodeConstructor<generic> newNode = new NodeConstructor<>(value, null);

        try {
            current.reference = newNode;
        } catch (NullPointerException ex) {
            System.out.println("I see that you are trying to append a node to an empty list. Instead of using the append method for this operation, I would recommend you try the insert method instead, to create an initial head. I am sure you will find that it meets your needs more thoroughly than append in this case. Once you have a single node created, you are able to use append with abandon.");
        }
    }


    /**
     * the insertBefore method takes in a node value and target value, searches for the target value, and inserts the
     * node value as a new node on the head side of the list of the target value.
     */
    public void insertBefore(generic value, generic target) {
        NodeConstructor<generic> current = this.head;

        while (current.reference.value != target) {
            current = current.reference;
        }

        NodeConstructor<generic> newNode = new NodeConstructor<generic>(value, current.reference);

        current.reference = newNode;
    }

    /**
     * the insertAfter method takes in a node value and target value, searches for the target value, and inserts the
     * node value as a new node on the null side of the list of the target value.
     */
    public void insertAfter(generic value, generic target) {
        NodeConstructor<generic> current = this.head;

        while (current.value != target) {
            current = current.reference;
        }

        NodeConstructor newNode = new NodeConstructor(value, current.reference);
        current.reference = newNode;
    }

    /**
     * the kthFromTheEndSearch takes in a value k and searches thr
     */
    public generic kthFromTheEndSearch(int k) {
        NodeConstructor<generic> current = this.head;

        ArrayList<generic> linkedListArrayList = new ArrayList<>();

        while (current != null) {
            linkedListArrayList.add((generic) current);
            current = current.reference;
        }

//        NodeConstructor<generic> test = new NodeConstructor(6, null);
        generic returnValue = null;

        current = this.head;
        for (int i = linkedListArrayList.size() - 1; i >= k; i--) {

            if (i == k) {
                returnValue = current.value;
            }
            current = current.reference;
        }
        return returnValue;


    }


}
