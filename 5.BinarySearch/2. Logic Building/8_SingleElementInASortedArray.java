/*
https://leetcode.com/problems/single-element-in-a-sorted-array/

Example 1:
Input: nums = [1,1,2,3,3,4,4,8,8]
Output: 2

Example 2:
Input: nums = [3,3,7,7,10,11,11]
Output: 10

TC : O(log n)
SC : O(1)
*/

class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low = 0;
        int high = nums.length -1;

        // Single Element :
        if(nums.length == 1){
            return nums[0];
        }

        while(low < high){
            int mid = low +(high - low) /2;
            if(mid % 2 == 1){
                mid --;
            }
            if(nums[mid] == nums[mid +1]){
                low = mid +2;
            }
            else{
                high = mid;
            }
        }
        return nums[low];
        
    }
}