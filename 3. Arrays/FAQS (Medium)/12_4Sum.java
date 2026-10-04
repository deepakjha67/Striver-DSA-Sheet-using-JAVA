//https://leetcode.com/problems/4sum/description/

// TC : O(N^3)
// SC : O(1)

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;

        for(int a = 0; a < n -3; a++){
            if(a > 0 && nums[a] == nums[a -1] ){
                continue;
            }
            for(int b = a + 1;b < n -2; b++){
                
            if(b > a +1 && nums[b] == nums[b -1] ){
                continue;
            }

                int i = b + 1;
                int j = n -1;
                while(i < j){
                    long sum = (long) nums[a] + nums[b] + nums[i] + nums[j];

                    if(sum < target){
                        i++;
                    } else if(sum > target){
                        j--;
                    }
                    else {
                        result.add(Arrays.asList(nums[a] , nums[b], nums[i], nums[j]));
                        i++;
                        j--;

                        while(i < j && nums[i] == nums[ i -1]){
                            i++;

                        }
                        while(i < j && nums[j] == nums[j +1] ){
                            j--;
                        }
                    }

                }
          
            }
        }
        return result;
        
    }
}