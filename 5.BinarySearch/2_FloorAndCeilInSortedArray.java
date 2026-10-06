https://www.geeksforgeeks.org/problems/floor-in-a-sorted-array-1587115620/1

class Solution {
    public int[] getFloorAndCeil(int[] nums, int x) {

      ArrayList<Integer> ans = new ArrayList<>();
      ans.add(-1);

      
      int start = 0;
      int end = nums.length -1;

      int ceil = -1;
      int floor = -1;

      

      while(start <= end){
        int mid = start +(end - start) /2;

        if(nums[mid] > x){
          ceil = nums[mid];
          end = mid -1;
        }
        else if(nums[mid] < x){
          floor = nums[mid];
          start = mid +1;
        }
        else {
          floor = nums[mid];
          ceil = nums[mid];
          break;
        }
      }
      return new int[] {floor, ceil};
       
    }
}