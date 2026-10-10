// https://leetcode.com/problems/sqrtx/

// TC :O(log x)
// SC :O(1)

class Solution {
    public int mySqrt(int x) {

        if(x == 0){
            return 0;
        }
        int result = 1;

        int left = 1;
        int right = x;

        while(left <= right){
            int mid = left +(right - left) /2;
            long sqrt = (long) mid * mid;

            
            if(sqrt == x){
                return mid;
            }
            else if(sqrt < x){
                result = mid;
                left = mid +1;

            }
            else {
                right = mid -1;
            }
        }
        return result;
        
    }
}