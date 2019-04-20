public class BinarySearch {

    public static void main(String[] args) {

        int[] testArray = {
                1, 3, 4, 5, 6, 7
        };

        System.out.println(binarySearch(testArray, 7));

    }

    public static int binarySearch(int[] arr, int key) {

        int returnValue = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == key) {
                returnValue = i;
                break;
            } else if (i == (arr.length - 1)) {
                returnValue = -1;
            }
        }

        return returnValue;
    }
}