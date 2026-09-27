// https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/

// TC : O(n)
// SC : O(n)
class Solution {

    public boolean check(int[] nums) {
        int n = nums.length;
        int count = 0;

        for(int i = 0; i < n; i++) {
            if(nums[i] > nums[(i + 1) % n] ){
                count++;
            }
            
        }
        return count<=1;
    }
}