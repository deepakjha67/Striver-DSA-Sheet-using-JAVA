// https://www.geeksforgeeks.org/problems/print-n-to-1-without-loop/1

class Solution {
    public void printNos(int n) {
        // code here
        
        if(n == 0){
            return;
        }
        System.out.print(n + " ");
        printNos(n -1);
        
    }
}