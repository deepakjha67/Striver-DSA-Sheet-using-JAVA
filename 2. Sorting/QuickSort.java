import java.util.*;

public class QuickSort {

    // Main sorting function
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {                       // only sort if more than 1 element
            int pIndex = partition(arr, low, high);
            quickSort(arr, low, pIndex - 1);    // sort left half
            quickSort(arr, pIndex + 1, high);   // sort right half
        }
    }

    // Places pivot at correct position, returns its index
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j) {
            // find first element GREATER than pivot from left
            while (arr[i] <= pivot && i < high) i++;
            // find first element SMALLER than pivot from right
            while (arr[j] > pivot && j > low) j--;

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // place pivot at its correct position (swap with arr[j])
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;  // partition index
    }

    public static void main(String[] args) {
        int[] arr = {4, 6, 2, 5, 7, 9, 1, 3};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr)); // [1, 2, 3, 4, 5, 6, 7, 9]
    }
}