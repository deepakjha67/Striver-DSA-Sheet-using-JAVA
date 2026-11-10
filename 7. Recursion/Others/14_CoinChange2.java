// https://leetcode.com/problems/coin-change-ii/

class Solution {

    int n;

    public int numberOfWays(int[] coins, int i, int amount) {

        // Base case 1: Amount is completed
        if (amount == 0) {
            return 1;
        }

        // Base case 2: No coins left or amount becomes negative
        if (i == n || amount < 0) {
            return 0;
        }

        // If current coin is greater than amount, skip it
        if (coins[i] > amount) {
            return numberOfWays(coins, i + 1, amount);
        }

        // Choice 1: Take the current coin
        int take = numberOfWays(coins, i, amount - coins[i]);

        // Choice 2: Skip the current coin
        int skip = numberOfWays(coins, i + 1, amount);

        return take + skip;
    }

    public int change(int amount, int[] coins) {
        n = coins.length;

        return numberOfWays(coins, 0, amount);
    }
}
