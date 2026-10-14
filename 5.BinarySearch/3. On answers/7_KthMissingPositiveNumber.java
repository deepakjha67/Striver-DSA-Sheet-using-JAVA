// https://leetcode.com/problems/kth-missing-positive-number/description/


// Approach 1 : Linear Time Complexity

class Solution1 {
    public int kthMissing(int[] nums, int k) {
        // code here
        int i = 0;
        int n = nums.length;
        int num = 1;
        
        while(i < n && k >0){
            if(nums[i] == num){
                i++;
            } else{
                k--;
            }
            num++;
        }
        while(k-- > 0){
            num++;
        }
        return num -1;
    }
}

// Approach 2 :

class Solution {
    public int kthMissing(int[] nums, int k) {
        // code here
        
        int s = 0;
        int e = nums.length -1;
        
        while(s <= e){
            int mid = s + (e - s) /2;
            int Missing = nums[mid] - (mid +1);
            
            if(Missing < k){
                s = mid +1;
                
            } else{
                e = mid -1;
            }
        }
        return s  + k;
        
    }
}