package stacksandqueues;

import sun.net.www.content.text.Generic;

import javax.annotation.Nullable;

public class NodeConstructor<Generic> {

    public NodeConstructor reference;
    public Generic value;

    public NodeConstructor(Generic value, @Nullable NodeConstructor reference) {

        this.value = value;
        this.reference = reference;
    }


}
