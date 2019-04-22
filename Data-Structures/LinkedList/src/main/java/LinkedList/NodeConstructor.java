package LinkedList;

import javax.annotation.Nullable;

public class NodeConstructor {

    public NodeConstructor reference;
    public String value;

    public NodeConstructor(String value, @Nullable NodeConstructor reference) {

        this.value = value;
        this.reference = reference;
    }
}
