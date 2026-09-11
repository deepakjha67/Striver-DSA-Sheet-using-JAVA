// https://www.geeksforgeeks.org/problems/largest-element-in-array4009/1

// TC: O(n)
// SC: O(1)

class Solution {
    public static int largest(int[] arr) {
        // code here
        int max = arr[0];
        for(int i = 1; i < arr.length; i ++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}