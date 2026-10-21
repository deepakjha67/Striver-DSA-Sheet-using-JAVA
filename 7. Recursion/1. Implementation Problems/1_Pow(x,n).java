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

// Using Recursion

// Time complexity: O(log |n|)
// Auxiliary space complexity: O(log |n|), because recursive calls use the call stack.
class Solution2 {
    public double myPow(double x, int n) {

        // Convert int to long to handle Integer.MIN_VALUE safely
        long power = n;

        // Handle negative exponent
        if (power < 0) {
            x = 1.0 / x;
            power = -power;
        }

        // Call the recursive function
        return helper(x, power);
    }

    private double helper(double x, long n) {

        // Base case: anything raised to power 0 is 1
        if (n == 0) {
            return 1.0;
        }

        // Recursively calculate x^(n/2) only once
        double half = helper(x, n / 2);

        // Square the result
        double result = half * half;

        // If n is odd, multiply by x one extra time
        if (n % 2 == 1) {
            result = result * x;
        }

        return result;
    }
}
