// https://www.geeksforgeeks.org/problems/largest-element-in-array4009/1

// TC: O(n)
// SC: O(1)


// Brute Force : 

class Solution1 {
    public static int largest(int[] arr) {
        
        // Sort a copy to preserve the original arrangement.
        int[] SortedNums = Arrays.copyOf(arr , arr.length);
        Arrays.sort(SortedNums);
        
        // The final position contains the largest value after sorting.
        return SortedNums[SortedNums.length -1];
        
    }
}

// Optimal : 
class Solution2 {
    public static int largest(int[] arr) {

        int nums = arr[0];
        for(int i = 1; i <= arr.length -1; i++) {
            if(arr[i] > nums){
                nums = arr[i];
            }
        }
        return nums;
    }
}