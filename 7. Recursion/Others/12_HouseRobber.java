// https://leetcode.com/problems/house-robber/description/

class Solution {
    static int solve(int[] nums, int index){
        // base case

        if(index >= nums.length){
            return 0;
        }
        // Solve one case :
        
        // include and exclude

        int includeAns = nums[index] + solve(nums, index + 2);
        int excludeAns = 0 + solve(nums, index +1);

        int finalAns =  Math.max(includeAns, excludeAns);
        return finalAns;
    }
    public int rob(int[] nums) {

        int index = 0;
        int ans = solve(nums, index);
        return ans;
    }
}