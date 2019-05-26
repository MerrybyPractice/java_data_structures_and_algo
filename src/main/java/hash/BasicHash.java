package hash;

public class BasicHash {

    public static int hash(String key) {
        char[] array = key.toCharArray();

        int index = 1;

        for (char c : array) {
            index *= c;
        }

        return index;
    }

}
