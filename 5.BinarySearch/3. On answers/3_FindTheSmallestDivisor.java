// https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/description/

// TC : log 2(max) * N
// SC : O(1)

class Solution {
    private static int sumofdiv(int[] nums, int divisor){
        int sum = 0;
        for(int num : nums){
            sum += (num + divisor -1) / divisor;
        }
        return sum;
    }

    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        if(n > threshold){
            return -1;
        }
        int max = Integer.MIN_VALUE;
        for(int num : nums){
            max = Math.max(max, num);
        }
        int low = 1;
        int high = max;
        int answer = -1;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(sumofdiv(nums, mid) <= threshold){
                answer = mid;
                high = mid -1;
            }
            else{
                low = mid +1;
            }
        }
        return answer;
    }
}