// https://www.geeksforgeeks.org/problems/allocate-minimum-number-of-pages0937/1

class Solution {
    static boolean isValid(int[] nums, int k, long mid){ // mid is max pages
        int studentCount = 1;
        long pages = 0;
        
        for(int i = 0; i< nums.length; i++){
            if(nums[i] + pages <= mid){
                // can be assignrd :
                pages = pages + nums[i];
                
            } else{
                // can't be assigned : -> new student
                studentCount++;
                if(studentCount > k || nums[i] > mid){
                    return false;
                }
                else{
                    // can be assigned to new students :
                    pages = 0;
                    pages = pages + nums[i];
                }
               
            }
            
        }
        return true;
        
    }
    public int findPages(int[] nums, int k) {
        // code here
        
        if(nums.length < k){
            return -1;
        }
        long sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum = sum + nums[i];
        }
        

        
        long s = 0;
        long e = sum;
        
        long ans = -1;
        
        while(s <= e){
            long mid = s + (e - s)/2;
            
            if(isValid(nums, k, mid)){
                
                ans = mid;
                e = mid -1;
            } else{
                
                s = mid +1;
            }
        }
        return (int)ans;
    }
}