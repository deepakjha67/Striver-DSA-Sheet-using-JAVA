// https://takeuforward.org/practice/dsa/lower-bound-?tab=problem


// Brute Force :
// TC : O(N)
// SC : O(1)

class Solution1 {
    public int lowerBound(int[] nums, int x) {

      int n = nums.length;
      int start = 0;
      int end = n -1;
      int mid = (start + end) /2;

      while(start < end){
        if(x >= nums[mid]){
          return mid;
        }
      }
}

// Optimal :

// TC : O( log N)
// SC : O(1)

class Solution2 {
    public int lowerBound(int[] nums, int x) {
       

       int ans = nums.length;
       int start = 0;
       int end = nums.length -1;
       while(start <= end){
        int mid = (start + end) /2;
        if(nums[mid] >= x){
          ans = mid;
          end = mid -1;

        }
        else{
          start = mid + 1;
        }
       }
       return ans;
     }
     
}
