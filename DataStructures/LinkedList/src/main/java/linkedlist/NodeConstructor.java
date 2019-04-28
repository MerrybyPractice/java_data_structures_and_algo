package linkedlist;

import javax.annotation.Nullable;

public class NodeConstructor<generic> {

    public NodeConstructor reference;
    public generic value;

    public NodeConstructor(generic value, @Nullable NodeConstructor reference) {

        this.value = value;
        this.reference = reference;
    }
}
