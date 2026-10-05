// https://takeuforward.org/practice/dsa/upper-bound?tab=problem

// TC : O(log N)
// SC : O(1)

class Solution1 {
    public int upperBound(int[] nums, int x) {

      int ans = nums.length;
      int start = 0;
      int end = nums.length -1;

      while(start <= end){
        int mid = (start + end) /2;

        if(nums[mid] > x){
          ans = mid;
          end = mid -1;

        }
        else {
          start = mid +1;
        }
      }
      return ans;
  
    }
}
