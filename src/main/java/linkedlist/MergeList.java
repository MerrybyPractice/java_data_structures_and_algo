package linkedlist;

public class MergeList {

    public static NodeConstructor mergeLists(LinkedList L1, LinkedList L2) {

        NodeConstructor currentL1 = null;
        NodeConstructor currentL2 = null;

        try {
            currentL1 = L1.head;
        } catch (NullPointerException ex) {
            L2.head = L1.head;

        }
        try {
            currentL2 = L2.head;
        } catch (NullPointerException ex) {
            L1.head = L2.head;
        }

        NodeConstructor l1Next = currentL1;
        NodeConstructor l2Next = currentL2;

        boolean breakWhileLoop = true;

        while (breakWhileLoop) {

            try {
                l1Next = currentL1.reference;
            } catch (NullPointerException ex) {
                if (currentL1 == null) {
                    currentL1.reference = currentL2;
                    break;
                } else if (currentL2 == null) {
                    currentL2.reference = currentL1;
                    break;
                }
            }
            try {
                l2Next = currentL2.reference;
            } catch (NullPointerException ex) {
                if (currentL2 == null) {
                    currentL2.reference = currentL1;
                    break;
                } else if (currentL1 == null) {
                    currentL2.reference = currentL1;
                    break;
                }
            }

            currentL1.reference = currentL2;
            currentL2.reference = l1Next;

            currentL1 = l1Next;
            currentL2 = l2Next;

            if (currentL1 == null || currentL2 == null) {
                breakWhileLoop = false;
            }
        }
        return L1.head;
    }
}