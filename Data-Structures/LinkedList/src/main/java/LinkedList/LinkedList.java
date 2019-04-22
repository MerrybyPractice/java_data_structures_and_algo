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
}
