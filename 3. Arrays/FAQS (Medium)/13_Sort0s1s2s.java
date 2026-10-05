// https://leetcode.com/problems/sort-colors/description/ 
// brute force :

// TC : O(n log n)
// SC : O(1)

class Solution {
    public void sortZeroOneTwo(int[] nums) {
        Arrays.sort(nums);

    }
}    

// Better :

// TC : O(N)
// SC : O(1)

class Solution2 {
    public void sortZeroOneTwo(int[] nums) {
      int zerocount = 0;
      int onecount = 0; 
      int twocount = 0;

      for(int val : nums){
        if(val == 0){
          zerocount++;
        }
        else if(val == 1){
          onecount++;
        }
        else{
          twocount++;
        }
      }

      int index = 0;

      for(int zero = 0; zero < zerocount; zero++){
        nums[index] = 0;
        index++;
      }
      for(int one = 0; one < onecount; one++){
        nums[index] = 1;
        index++;
      }
      for(int two = 0; two < twocount; two++){
        nums[index] = 2;
        index++;
      }
        
    }
}

// Optimal :

// TC : O(n)
// SC : O(1)

class Solution3 {
    public void sortColors(int[] nums) {

        int n = nums.length;

        int i = 0;
        int j = 0;
        int k = n -1;

        while(j <= k){
            if(nums[j] == 1){
                j++;
            }

            else if(nums[j] == 2){
                int temp = nums[j];
                nums[j] = nums[k];
                nums[k] = temp;
                k--;

                
            }
            else {

                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
                j++;}
            }
        }
        
    }
