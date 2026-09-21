// https://leetcode.com/problems/search-in-rotated-sorted-array/description/


class Solution {
    public int search(int[] nums, int target) {
        int i = 0;
        int n = nums.length;

        for(i = 0; i < n; i++) {
            if(nums[i] == target) {
                return i;
            }
        }

        return -1;
        
    }
}