package LinkedList;

public class MergeList<generic> {

    public static NodeConstructor mergeLists(LinkedList L1, LinkedList L2) {

        try {
            NodeConstructor currentL1 = L1.head;
        } catch (NullPointerException ex) {
            return L2.head;
        }
        try {
            NodeConstructor currentL2 = L2.head;
        } catch (NullPointerException ex) {
            return L1.head;
        }


        while (true) {

            try {
                NodeConstructor l1Next = currentLl.refrence;
            } catch (NullPointerException ex) {
                if (L1.refrence = null) {
                    L1.refrence = currentL2;
                } else if (L2.refrence = null) {
                    L2.refrence = currentL1;
                }
            }
            try {
                NodeConstructor l2Next = currentL2.refrence;
            } catch (NullPointerExeption ex) {
                if (L1.refrence = null) {
                    L1.refrence = currentL2;
                } else if (L2.refrence = null) {
                    L2.refrence = currentL1;
                }
            }

            currentL1.refrence = currentL2;
            currentL2.refrence = l1Next;

            currentL1 = l1Next;
            currentL2 = l2Next;
        }

    }
}