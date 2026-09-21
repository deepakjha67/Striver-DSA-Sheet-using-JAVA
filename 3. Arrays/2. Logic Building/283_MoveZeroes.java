/* 
https://leetcode.com/problems/move-zeroes/

Brute : 
TC: O(n)
SC : O(n)

class Solution {
    public void moveZeroes(int[] nums) {
        List<Integer> temp = new ArrayList<>();

        int n = nums.length;

        for(int i = 0; i < nums.length; i++){   // step 1: collect non-zeros

            if(nums[i] != 0){
                temp.add(nums[i]);
            }
        }

        for(int i = 0; i< temp.size(); i++){   // step 2: put them at front
            nums[i] = temp.get(i);
        }

        for(int i = temp.size(); i < n; i++){ // step 3: fill zeros
            nums[i] = 0;
        }
    }
}

*/

// Two Pointer
// TC: O(n)
// SC: O(1)
class Solution {
    public void moveZeroes(int[] nums) {
        int j = -1;
        int n = nums.length;
        for(int i = 0; i < n; i++){           // step 1: find first zero
            if(nums[i] == 0){
                j = i;
                break;
            }
        }

        if(j == -1) {                    // no zeros, nothing to do
            return;
        }

        for(int i = j +1; i < n; i++){       // step 2: swap non-zeros forward
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                j++;
            }
        }
    }
}