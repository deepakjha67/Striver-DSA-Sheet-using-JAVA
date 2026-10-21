// https://leetcode.com/problems/powx-n/description/

// TC : (O(log |n|)
// SC : O(1)

class Solution {
    public double myPow(double x, int n) {
        double ans = 1.0;

        long power = n;

        boolean isNegative = power < 0;
        if (power < 0){
            power = - power;
        }

        while(power > 0){
            if(power %2 == 1){
                ans = ans * x;
            }

            x = x * x;
            power = power /2;
        }

        if(isNegative){
            ans = 1.0/ ans;
        }
        return ans;
    }
}