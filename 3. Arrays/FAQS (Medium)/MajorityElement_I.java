// https://leetcode.com/problems/majority-element/description/


// Brute Force :
// TC : O(n^2)
// SC : O(1)

class Solution1 {
    public int majorityElement(int[] nums) {

      int threshold = nums.length / 2;
      
      for(int candidate : nums){
        int frequency = 0;
        
          for(int value : nums){
              if(value == candidate){
                  frequency++;
              }
          }
              if(frequency > threshold){
                return candidate; 
              }

        }

      return -1;
        
    }
}



// Better Solution
// TC : O(n)
// SC :  O(k), where k is the number of distinct values stored in the hash map

class Solution2 {
    public int majorityElement(int[] nums) {

        int threshold = nums.length / 2;

        HashMap <Integer, Integer> frequencies = new HashMap <>();
        for(int value : nums){
            int updatedfrequencies = frequencies.getOrDefault(value, 0)  + 1;

            frequencies.put(value, updatedfrequencies);

            if(updatedfrequencies > threshold){
                return value;
            }
        }
        return -1;
    }
}


// Optimal (Boyer Moore Voting) :
// TC : O(n)
// SC : O(1)

class Solution3 {
    public int majorityElement(int[] nums) {

// Initialize candidate and their frequency as 0 :
        int candidate = 0;
        int frequency = 0;

// Iterate on array and store the value in variable:  
        for(int value : nums){
// If the frequency = 0 then candidate will be the value :            
            if(frequency == 0) {
                candidate = value;
            }
// If value = candidate -> Increase the frequency            
            if(value == candidate) {
                frequency++;
            }
// else Decrease the frequency            
            else{
                frequency--;
            }
        }
        return candidate;
        
    }
}