import java.util.Arrays;

public class ArrayShift {
    public static void main(String[] args) {

        int[] myEvenArray = new int[]{1, 3, 4, 5};
        int six = 6;
        System.out.println(insertShiftArray(myEvenArray, six));

        int[] myOddArray = new int[]{7, 3, 5};
        int nine = 9;
        System.out.println(insertShiftArray(myOddArray, nine));

//        int[] myEmptyArray = new int[]{};
//        int zero = 0;
//        System.out.println(insertShiftArray(myEmptyArray, zero));
    }

    public static String insertShiftArray(int[] inputArray, int inputInt) {
        int[] outputArray;
        outputArray = new int[inputArray.length + 1];
        int[] holdArray;
        holdArray = new int[outputArray.length / 2];
        holdArray[0] = inputInt;
        int midPoint = (outputArray.length / 2);

        for (int i = midPoint; i < outputArray.length; i++) {
            for (int l = 1; l < holdArray.length; l++) {

                holdArray[l] = i;
            }
        }

        for (int j = 0; j < holdArray.length; j++) {
            for (int k = midPoint; k < outputArray.length; k++) {

                j = k;
            }
        }
        return Arrays.toString(outputArray);
    }
}
