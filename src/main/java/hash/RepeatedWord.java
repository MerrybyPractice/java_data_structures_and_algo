package hash;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Set;

public class RepeatedWord {
    public static String repeatedWord(String input) {
        String[] inputArray = input.split(" ");
        ArrayList excludeArray = new ArrayList();
        excludeArray.add(".");
        excludeArray.add(",");
        excludeArray.add("!");
        excludeArray.add(":");
        excludeArray.add(";");

        Hashtable counter = new Hashtable();
        String returnValue = "";

        for (String word : inputArray) {

            if (excludeArray.contains(word)) {
                continue;
            } else if (counter.contains(word)) {
                returnValue = word;
            } else {
                counter.add(word, word);
            }
        }

        return returnValue;
    }

}
