// https://leetcode.com/problems/koko-eating-bananas/description/

// TC : O(N x log2(max(piles))) 
// SC : O(1)
      /*
      Step 1: implement binary search
          -> high = fn(piles)
          -> calculatetotalHour(piles, mid)
          
       Step 2: write fn: calculatetotalHour(int[]arr, int k)
           -> Iterate pile: totalHours = Math.ceil((double) pile/k)
           
       Step 3: write fn: findmax(int[]arr)
           -> max = Integer.MIN_VALUE
           -> Iterate pile: max = Math.max(max, pile);
      
      
      */
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        //Step 1: binary search : find mid and TotalHours :
        int low = 1;
        int high = findmax(piles);
        int ans = high;
        while(low <= high){
            int mid = low +(high - low)/2;
            int totalHour = CalculateTotalHours(piles, mid);

            if(totalHour <= h){
                ans = mid;
                high = mid -1;
            }
            else{
                low = mid +1;
            }
        }
        return ans;
    }
    // Step 2 : Calculate total hours :
    private int CalculateTotalHours(int [] piles, int k){
        int totalHours =0;
        
        for(int pile : piles){
   
            totalHours += Math.ceil((double) pile/k);
        }
        return totalHours;
    }
    // Step 3 : Calculate max :

    private int findmax(int[] piles){
        int max = Integer.MIN_VALUE;

        for(int pile: piles){
            max =Math.max(max,pile);
        }
        return max;
    }

}