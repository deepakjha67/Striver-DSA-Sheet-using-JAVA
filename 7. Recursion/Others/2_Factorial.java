// https://www.geeksforgeeks.org/problems/factorial5739/1

class Solution {
    int factorial(int n) {
        //Base Case:
        if(n == 0){
            return 1;
        }
        
        int f = n * factorial(n-1);
        return f;
    }
}
