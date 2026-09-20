// https://leetcode.com/problems/missing-number/


// Approach 1 (XOR) :
// TC : O(n)
// SC: O(1)

class Solution1 {
    public int missingNumber(int[] nums) {

        int sum = nums.length;

        for(int i = 0; i< nums.length; i++){

            sum = sum ^ i;
            sum = sum ^ nums[i];

        }
        return sum;
    }
}
// Approach 2 (SUM) :
// TC : O(n)
// SC: O(1)


class Solution2 {
    public int missingNumber(int[] nums) {

        int n = nums.length;
        int sum = n * (n + 1)/ 2;

        for(int i = 0; i < nums.length; i++) {

            sum = sum - nums[i];  
        }
        return sum;
    }
}

// Brute force :

// TC : O(N^2) 
// SC : O(1)  

class Solution3 {
    public int missingNumber(int[] nums) {
        int n = nums.length;

        for(int i = 0; i <= n; i++){

            boolean found = false;

            for(int j = 0; j < n; j++) {

                if(nums[j] == i){
                    found = true;
                    break;
                }  
            }
            if(!found) {
                return i;
            }
        }
        return -1;
    }
}


// Approach 4 - Better (Hash Array) :
// TC: O(n)
// SC: O(n)

class Solution4 {
    public int missingNumber(int[] nums) {
        int n = nums.length;

        int[] hash = new int[n + 1];

        for(int i = 0; i < n; i++){
            hash[nums[i]] = 1;

        }

        for(int i = 0; i <= n; i++){
            if(hash[i] == 0){
            return i;
            }
        
        }
        return -1;
    }
}