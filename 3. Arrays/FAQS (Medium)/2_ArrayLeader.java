// https://www.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1


// Brute Force :
// TC : O(n^2)
// SC : O(1) auxiliary space, because only loop variables and a Boolean flag are required. 

class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        int n = arr.length;
        ArrayList<Integer> value = new ArrayList<>();
        
        for(int i = 0 ; i < n; i++){
            
            boolean leaders = true;
            
            for(int j = i+1; j < n; j++){
                
                if(arr[i] < arr[j]){
                    leaders = false;
                }   
            }
            if(leaders){
                value.add(arr[i]);
            }
        }
        return value;
    }
}


// Optimal :
// TC : O(n)
// SC : O(1)

class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        int n = arr.length;
        
        if(n == 0){
            return new ArrayList<>();
        }
        
        ArrayList <Integer> value = new ArrayList<>();
        
        int maxval = arr[n -1];
        
        value.add(maxval);
        
        for(int index = n -2; index >= 0; index--){
            
            if(arr[index] >= maxval){
                value.add(arr[index]);
            }
            
            maxval = Math.max(arr[index], maxval);
        }
        // Reverse :
        Collections.reverse(value);
        return value;        
    }
}
