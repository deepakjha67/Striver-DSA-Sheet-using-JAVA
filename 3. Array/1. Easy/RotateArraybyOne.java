// https://www.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one2614/1

class Solution {
    public void rotate(int[] arr) {
        // Edge case: if the array is null or has 0/1 element,
        // no rotation is needed.
        if (arr == null || arr.length <= 1) {
            return;
        }

        // Step 1: Save the last element.
        // In a right rotation by one, the last element moves to the front.
        int temp = arr[arr.length - 1];

        // Step 2: Shift every element one position to the right.
        // We iterate from the end towards the start so that we don't
        // overwrite values before they are moved.
        // Example: [1, 2, 3, 4, 5] becomes [1, 1, 2, 3, 4] after this loop.
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        // Step 3: Place the saved last element at the first position.
        // Final result: [5, 1, 2, 3, 4]
        arr[0] = temp;
    }
}
