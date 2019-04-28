package linkedlist;

public class MergeList<generic> {

    public static NodeConstructor mergeLists(LinkedList L1, LinkedList L2) {

        NodeConstructor currentL1;
        NodeConstructor currentL2;

        try {
            currentL1 = L1.head;
        } catch (NullPointerException ex) {
            return L2.head;
        }
        try {
            currentL2 = L2.head;
        } catch (NullPointerException ex) {
            return L1.head;
        }

        NodeConstructor l1Next = currentL1;
        NodeConstructor l2Next = currentL2;

        while (true) {

            try {
                l1Next = currentL1.reference;
            } catch (NullPointerException ex) {
                if (currentL1.reference == null) {
                   currentL1.reference = currentL2;
                } else if (currentL2.reference == null) {
                    currentL2.reference = currentL1;
                }
            }
            try {
                l2Next = currentL2.reference;
            } catch (NullPointerException ex) {
                if (currentL1.reference == null) {
                    currentL1.reference = currentL2;
                } else if (currentL1.reference == null) {
                    currentL2.reference = currentL1;
                }
            }

            currentL1.reference = currentL2;
            currentL2.reference = l1Next;

            currentL1 = l1Next;
            currentL2 = l2Next;
        }

    }
}