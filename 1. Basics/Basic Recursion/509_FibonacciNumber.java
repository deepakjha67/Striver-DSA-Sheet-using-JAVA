// https://leetcode.com/problems/fibonacci-number/
// T: O(2^n)
class Solution {
    public int fib(int n) {
        return fibRec(n);  
    }

    private int fibRec(int n) {
        if (n <= 1) {
            return n;
        }
        int last = fibRec(n - 1);
        int slast = fibRec(n - 2);
        return last + slast;
    }
}