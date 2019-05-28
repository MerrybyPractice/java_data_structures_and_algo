package hash;

public class StringIndexHash {
    public static int hash(String key) {
        char[] array = key.toCharArray();

        int index = 1;

        for (int i = 0; i < array.length; i++) {

            int c = array[i];

            c *= i;

            index *= c;
        }

        index *= 599;

        return index;
    }

}
