// https://www.geeksforgeeks.org/problems/print-gfg-n-times/1

class Solution {
    
    private void printName(int n){
        
        if(n == 0){
            return;
        }
        System.out.print("GFG ");
        printGfg(n-1);
        }
        
    void printGfg(int n) {
        // code here
        printName(n);
    }
}