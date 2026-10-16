// https://www.geeksforgeeks.org/problems/the-painters-partition-problem1535/1

// TC : O(n log m)
// SC : O(1)

class Solution {
    
    // Checks whether all boards can be painted
    // within maxLen time using at most k painters.
    
    static boolean isValidSolution(int nums[], int k , int mid){
        // mid -> max length of num a painter can paint
        int painterCount =1;
        int paintedLength = 0;
      
        
        for(int i =0; i < nums.length; i++){
            
            // Case 1: Current painter can paint this board.
            if(nums[i] + paintedLength <= mid){
                paintedLength = paintedLength + nums[i];
                
                
                
            // Case 2: A new painter is required.    
            }
            else{
                painterCount++;
                
                // Not enough painters, or one board
                // itself exceeds the allowed time.
                
                if(painterCount > k || nums[i] > mid){
                    return false;
                }
                // Assign the current board to the new painter.
                
                paintedLength =  nums[i];
                
            }
            // All boards were allocated successfully.
        }
        return true;
        
    }
    public int minTime(int[] nums, int k) {
        
        // Step 1 : Calc SUM
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum = sum + nums[i];
        }
        int ans = -1;
        
        
        // Step 2 :
        int s = 0;
        int e = sum;
        
        
        
        while( s <= e){
            int mid = s + (e -s)/2;
            
            if(isValidSolution(nums, k, mid)){
                ans = mid;
                e = mid -1;
            } else{
                s = mid +1;
            }
        }
        return ans;
    }
    
}
