package tree;

import java.util.ArrayList;

public class FizzBuzzTree {

    static Object fizzBuzz = "FizzBuzz";
    static Object fizz = "Fizz";
    static Object buzz = "Buzz";

    public static ArrayList<Object> fizzBuzzTree(NodeConstructor current, ArrayList<Object> fizzBuzzList) {

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
            Integer currentInteger = current.value;
            Object currentObject = currentInteger;
            fizzBuzzList.add(currentObject);
        }

        if (current.rightChild != null) {
            fizzBuzzTree(current.rightChild, fizzBuzzList);
        }

        return fizzBuzzList;
    }
}
