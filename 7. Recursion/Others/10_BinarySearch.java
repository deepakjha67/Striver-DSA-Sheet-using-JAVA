// https://leetcode.com/problems/binary-search/description/

class Solution {
    static int check(int[] nums, int s, int e, int target){

        if(s > e){
            return -1;
        }
        int mid = s + (e - s)/2;
        if(nums[mid] == target){
            return mid;
        }
        else if(nums[mid] < target){
            s = mid+1;
                 
        }
        else{
            e = mid -1;
                        
        }
        int ans = check(nums, s, e, target);
        return ans;
    }
    
    public int search(int[] nums, int target) {

        int s = 0;
        int e = nums.length -1;

        int ans = check(nums, s, e, target);
        return ans;
    }
}