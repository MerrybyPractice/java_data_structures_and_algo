package insertionsort;

public class InsertionSort {

    public static int[] insertionSort(int[] inputArray) {

        for (int i = 0; i < inputArray.length; i++) {

            int j = i - 1;
            int temp = inputArray[i];

            while (j >= 0 && temp < inputArray[j]) {

                inputArray[j + 1] = inputArray[j];

                j = j - 1;

                inputArray[j + 1] = temp;
            }

        }

        return inputArray;
    }

}
