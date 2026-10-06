// https://leetcode.com/problems/search-in-rotated-sorted-array/description/

// TC :O(log 2 N)
// SC :O(1)


class Solution {
    public int search(int[] nums, int target) {

        int s = 0;
        int e = nums.length -1;
        
        while(s <= e){
            int mid = s + ( e - s) /2;

            if(nums[mid] == target){
                return mid;
            }

            // sorted left side
            if(nums[s] <= nums[mid]){ 
                
                // nums[s] <= target < nums[mid]
                if(nums[s] <= target && target < nums[mid]){ 
                    e = mid -1;
                }
                else {
                    s = mid +1;
                }
            }
            else{ // sorted right side
                
                // nums[mid] <= target < nums[e]
                if(nums[mid] < target && target <= nums[e] ){ 
                    s = mid +1;
                }
                else{
                    e = mid -1;
                }
            }
        }
        return -1;
        
    }
}