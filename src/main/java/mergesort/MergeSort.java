package mergesort;

public class MergeSort {

    public void merge(int[] arr, int first, int mid, int last) {

        //instantiate holding array

        int[] holdingArr = new int[]{last - first + 1};

        int i = first; //set up to track first array passed in
        int j = mid + 1; //set up to track second array passed in
        int k = 0; //set up to track holdingArr

        while (i <= mid && j <= last) {
            if (i <= j) {
                holdingArr[k] = arr[i];
                k++;
                i++;
            } else {
                holdingArr[k] = arr[j];
                k++;
                j++;
            }

        }

        while (i <= mid) {
            holdingArr[k] = arr[i];
            k++;
            i++;
        }

        while (j <= last) {
            holdingArr[k] = arr[j];
            k++;
            j++;
        }

        for (i = first; i < last; i++) {
            arr[i] = holdingArr[i - first];
        }
    }

    public void sort(int[] arr, int first, int last) {

        int mid = (first + last) / 2;

        //recursion

        sort(arr, first, mid);
        sort(arr, mid + 1, last);

        merge(arr, first, mid, last);
    }
}
