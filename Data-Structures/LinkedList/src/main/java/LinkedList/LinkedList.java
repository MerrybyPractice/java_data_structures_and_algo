package LinkedList;

import java.util.ArrayList;
import java.util.List;

public class LinkedList {

    public NodeConstructor head;
    public NodeConstructor newNode;

    public LinkedList(String value) {
        head = new NodeConstructor(value, null);
    }

    public void insert(String value) {

        this.head = new NodeConstructor(value, this.head);
    }

    public boolean includes(String value) {
        NodeConstructor current = this.head;

        boolean inThisList = false;

        while (current.reference != null) {

            if (current.value != value) {
                current = current.reference;
            } else if (current.value == value) {
                inThisList = true;
            }
        }
        return inThisList;
    }

    public List print() {

        NodeConstructor current = this.head;

        ArrayList<String> printList = new ArrayList<>();

        while (current.reference != null) {
            printList.add(current.value);
            current = current.reference;
        }

        System.out.println(printList);
        return printList;
    }
}
