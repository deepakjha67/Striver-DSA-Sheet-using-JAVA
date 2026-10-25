// https://www.geeksforgeeks.org/problems/print-1-to-n-without-using-loops3621/1

class Solution {
    private void printN(int count, int n) {
        // code here
     
        if(count > n){
            return;
        }
        
        System.out.print(count +" ");
        count++;
        
        printN(count, n);
        
    }
    public void printTillN(int n) {
        printN(1, n);
    }
}