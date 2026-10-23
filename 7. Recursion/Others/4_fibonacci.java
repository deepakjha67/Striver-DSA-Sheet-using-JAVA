// https://leetcode.com/problems/fibonacci-number/description/

class Solution1 {
    public int fib(int n) {

        if(n == 0){
            return 0;
        }
        if(n ==1){
            return 1;
        }

        int first = fib(n -1);
        int last = fib(n -2);

        return first + last;
        
    }
}



class Solution2 {
    public int fib(int n) {

        int a = 0;
        int b = 1;

        if(n <= 0){
            return n;
        }
        for(int i = 2; i <= n; i++){
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}