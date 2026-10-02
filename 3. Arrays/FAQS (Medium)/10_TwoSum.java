// https://leetcode.com/problems/two-sum/description/
// TC : O(n ^ 2)
// SC : O(1)

class Solution1 {
    public int[] twoSum(int[] nums, int target) {

        int n = nums.length;

        for(int i = 0; i < n-1; i++){
            for(int j = i + 1; j < n; j++){
                if(nums[i] + nums[j] == target){
                    int ans[] = {i , j};
                    return ans;
                }
            }
        }
        int ans[] = {};
        return ans;
        
    }
}


// TC : O(n)
// SC : O(n)

class Solution2 {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> result = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int req = target - nums[i];
            if(result.containsKey(req)){
                return new int [] {result.get(req) , i};
            }
            else {
                result.put(nums[i] , i);
            }
        } 
        return null;

        
    }
}

