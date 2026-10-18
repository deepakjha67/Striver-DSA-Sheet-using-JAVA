// https://www.geeksforgeeks.org/problems/aggressive-cows/1

class Solution {
  static boolean isValid(int[] nums, int mid, int k){
    int CowsCount = 1;
    int lastLength = 0;

    for(int i = 0; i < nums.length; i++){
      if(nums[i] - nums[lastLength] >= mid){
        lastLength = i;
        CowsCount++;
      } 
      if(CowsCount == k){
        return true;
      }
    }
    return false;
  }
    public int aggressiveCows(int[] nums, int k) {
      int n = nums.length;
      Arrays.sort(nums);

      int s = 0;
      int e = nums[n -1] - nums[0];
      int result = -1;

      while(s <= e){
        int mid = s +(e - s)/2;

        if(isValid(nums, mid, k)){
          result = mid;
          s = mid +1;
        } else{
          e = mid -1;
        }
      }
      return result;
   
    }
}
