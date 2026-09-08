import java.util.*;

public class MergeSort {

    // Main merge sort function
    public static void mergeSort(int[] arr, int low, int high) {
        // Base case: single element (or invalid range) → already sorted
        if (low >= high) {
            return;
        }

        int mid = (low + high) / 2;

        // Step 1: sort left half
        mergeSort(arr, low, mid);
        // Step 2: sort right half
        mergeSort(arr, mid + 1, high);
        // Step 3: merge both sorted halves
        merge(arr, low, mid, high);
    }

    // Merge two sorted halves: [low..mid] and [mid+1..high]
    public static void merge(int[] arr, int low, int mid, int high) {
        List<Integer> temp = new ArrayList<>();

        int left = low;      // pointer for left half
        int right = mid + 1; // pointer for right half

        // Compare and add the smaller element
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        // Copy remaining elements of left half (if any)
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        // Copy remaining elements of right half (if any)
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        // Copy temp back into the original array
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4, 1, 5, 2, 6, 4};
        mergeSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
        // Output: [1, 1, 2, 2, 3, 4, 4, 5, 6]
    }
}