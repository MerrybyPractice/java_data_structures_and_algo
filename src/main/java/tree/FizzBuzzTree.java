package tree;

import java.util.ArrayList;

public class FizzBuzzTree<Object> {

    Object fizzBuzz = (Object) "FizzBuzz";
    Object fizz = (Object) "Fizz";
    Object buzz = (Object) "Buzz";

    public ArrayList<Object> fizzBuzzTree(NodeConstructor current, ArrayList<Object> fizzBuzzList) {
        if (current.leftChild != null) {
            fizzBuzzTree(current.leftChild, fizzBuzzList);
        }

        if (current.value % 3 == 0 && current.value % 5 == 0) {
            fizzBuzzList.add(fizzBuzz);
        } else if (current.value % 3 == 0) {
            fizzBuzzList.add(fizz);
        } else if (current.value % 5 == 0) {
            fizzBuzzList.add(buzz);
        } else {
            Integer currentInteger = (Integer) current.value;
            Object currentObject = (Object) currentInteger;
            fizzBuzzList.add(currentObject);
        }

        if (current.rightChild != null) {
            fizzBuzzTree(current.rightChild, fizzBuzzList);
        }

        return fizzBuzzList;
    }
}
