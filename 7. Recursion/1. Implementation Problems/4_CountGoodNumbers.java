class Solution {

    static final long MOD = 1000000007;

    public long power(long x, long n) {

        // Base case
        if (n == 0) {
            return 1;
        }

        // Recursive call
        long half = power(x, n / 2);

        // Square the result
        long ans = (half * half) % MOD;

        // If exponent is odd
        if (n % 2 == 1) {
            ans = (ans * x) % MOD;
        }

        return ans;
    }

    public int countGoodNumbers(long n) {

        long even = (n + 1) / 2;
        long odd = n / 2;

        long evenWays = power(5, even);
        long oddWays = power(4, odd);

        long ans = (evenWays * oddWays) % MOD;

        return (int) ans;
    }
}
