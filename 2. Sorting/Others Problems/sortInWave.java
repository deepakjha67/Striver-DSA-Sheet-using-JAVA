/*
https://www.geeksforgeeks.org/problems/wave-array-1587115621/1

arr[0] ≥ arr[1] ≤ arr[2] ≥ arr[3] ≤ arr[4] ≥ ... and so on

Input: arr[] = [1, 2, 3, 4, 5]
Output: [2, 1, 4, 3, 5]
*/
class Solution {
    public void sortInWave(int arr[]) {
        int n = arr.length;
        // code here
        for(int i = 0; i < n - 1; i += 2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }
}