//https://www.geeksforgeeks.org/problems/rotation4723/1

// TC :O(log n)
// SC :O(1)

class Solution {
    public int findKRotation(int arr[]) {
       
        int l = 0;
        int r = arr.length -1;
        int result = -1;
        
        while(l < r){
            int mid = l + (r - l) /2;
            if(arr[mid] < arr[r]){
                r = mid;
            }
            else{
                l = mid +1;
            }
        }
        return l;
    }
}