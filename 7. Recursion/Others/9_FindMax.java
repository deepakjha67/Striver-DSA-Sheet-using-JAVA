https://www.geeksforgeeks.org/problems/largest-element-in-array4009/1

class Solution {
    public static int largest(int[] arr) {
        // code here'
        return valid(arr, 0, arr[0]);
    }
    
    private static int valid(int[] arr, int i, int max){
        
        if(i >= arr.length){
            return max;
        }
        
    
        if(arr[i] > max){
            max = arr[i];
        }
        
        return valid(arr, i +1, max);
        
    }
}
