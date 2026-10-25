// https://www.geeksforgeeks.org/problems/array-traversal/1

class Solution {
    public void arrayTraversal(int[] arr) {
        // code here
        
        int i = 0;
        
        rec(arr, i);
    }
    
    private void rec(int[]arr, int i){
        
       
        if(i >= arr.length){
            return;
        }
        
        System.out.print(arr[i] + " ");
        rec(arr, i +1);
    }
}
