// https://leetcode.com/problems/single-element-in-a-sorted-array/description/

// Approach 01 (Brure Force) : 
// TC : O(n^2)
// SC : O(1)

import java.util.HashMap;

class Solution1 {
    public int singleNonDuplicate(int[] nums) {

        int n = nums.length;
        for(int i = 0; i < n; i++){
            int num = nums[i];
            int count = 0;


            for(int j = 0; j < n; j++){
                if(nums[j] == num){
                    count++;
                }
                
            } 
            if(count == 1) {
                return num;
            }

            
        }

        return -1;
        
    }
}

/*  
Approach 2 (Better) Hash Array :

TC : 3 for loop [O(n) + O(n) + O(n) = O(n)]
    But there's also the creation of the hash array: O(n + maxi)
SC : O(maxi)
*/
class Solution2 {
    public int singleNonDuplicate(int[] nums) {

        int n = nums.length;
        int maxi = nums[0];  // Setting 1st index as value of maxi

    // finding actual value of maxi by iterating on array
        for(int i = 0; i < n; i++){
            maxi = Math.max(maxi, nums[i]);  
        }

    // Create hash array :
        int[] hash = new int[maxi + 1];
        for(int i = 0; i < n; i++){
            hash[nums[i]]++;
        }

    // find element with count 1
        for(int i = 0; i < n; i++){
            if(hash[nums[i]] == 1) {
                return nums[i];
            }
        }     
        return -1;   
        
    }
}

// Approach 3 (Map DS)For negative numbers also :
class Solution3 {
    public int firstNonRepeating(int[] arr) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int num: arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(int num: arr){
            if(map.get(num) == 1){
                return num;
            }

        }
        return 0;

    }
}



// Approach 4 (xor) Optimal :
// TC : O(n)
// SC : O(1
)
class Solution4 {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int xor = 0;

        for(int i =0; i < n; i++) {
            xor = xor ^ nums[i];
        }
        return xor;
    }
}