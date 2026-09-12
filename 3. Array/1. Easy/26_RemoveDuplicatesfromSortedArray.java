/*

Brute Force: 
TC: O(n): We traverse entire array and insert elements into set.
SC: O(n): Additional space used to store elements in set.

class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        int index = 0;

        for(int num : nums){
            if(!seen.contains(num)){
                seen.add(num);
                nums[index] = num;
                index++;
            }
            
        }
        return index;
    }
}  
*/

// Optimal Solution:

class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;

        for(int j = 1; j <= nums.length -1; j++) {
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];

            }
        }

        return i+1;

    }
}
// TC: O(n): We traverse through the entire array only once
// SC: O(1): Constant additional space is used to check unique elements.