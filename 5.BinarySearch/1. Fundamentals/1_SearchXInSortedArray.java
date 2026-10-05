// https://leetcode.com/problems/binary-search/description/

// TC: O(log2 N)
// SC: O(1)


class Solution1 {
    public int search(int[] nums, int target) {

        int n = nums.length;
        int start = 0;
        int end = n -1;
        int mid = (start + end) /2;
        
        while(start <= end){
            
            if(nums[mid] == target){
                return mid;
            }
            else if(target > nums[mid]){
                start = mid +1;
            }
            else{
                end = mid -1;
            }

            // Important :
            mid = (start + end) / 2;
        }
        return -1;
        
    }
}