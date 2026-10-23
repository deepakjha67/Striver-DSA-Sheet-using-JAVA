// https://www.geeksforgeeks.org/problems/power-of-2-1587115620/1

class Solution {
    public boolean isPowerofTwo(int n) {
        // code here
        return n > 0 && (n & (n - 1)) == 0;
       
    }
}