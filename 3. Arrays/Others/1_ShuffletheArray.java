/ https://leetcode.com/problems/shuffle-the-array/?envType=problem-list-v2&envId=dsa-linear-shoal-array-i

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2 * n];
        int index = 0;
        
        for (int i = 0; i < n; i++) {
            ans[index++] = nums[i];     
            ans[index++] = nums[i + n]; 
        }
        
        return ans;
    }
}