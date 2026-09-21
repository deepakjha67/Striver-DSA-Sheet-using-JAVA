// https://www.geeksforgeeks.org/problems/union-of-two-sorted-arrays-1587115621/1

// Approach 1 :
/* 
class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        // Create TreeMap to store elements in sorted order
        
        int n = a.length;
        int m = b.length;
        
        TreeMap<Integer, Integer> freq = new TreeMap<>();
        // Loop through first array and store frequency
        for (int i = 0; i < n; i++)
            freq.put(a[i], freq.getOrDefault(a[i], 0) + 1);
        // Loop through second array and store frequency
        for (int i = 0; i < m; i++)
            freq.put(b[i], freq.getOrDefault(b[i], 0) + 1);
        // Create a list to store union result
        ArrayList<Integer> Union = new ArrayList<>();
        // Traverse map keys and add to union list
        for (int key : freq.keySet())
            Union.add(key);
        // Return the union list
        return Union;
    }
}
    */

// Approach 2 :

/* 
class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        
        Set<Integer> st = new TreeSet<>();
        
        for(int num: a){
            st.add(num);
        }
        
        for(int num: b){
            st.add(num);
        }
        
        return new ArrayList<>(st);
    }
}
*/

// Optimal Approach(Two Pointer) :

class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {

        // Created new Array List to store the Union Value
        ArrayList<Integer> union = new ArrayList<>();
        
        int m = a.length;
        int n = b.length;
        int i = 0;
        int j = 0;
        
        while(i < m && j < n){
            
            if(a[i] < b[j]) {
                
                // If union set is empty and the pervios index of the union is != arr[i]
                if(union.isEmpty() || union.get(union.size() -1) != a[i]){
                    
                    union.add(a[i]);   
                }
                i++;
            }
               
            else if (a[i] > b[j]) {
                
                if(union.isEmpty() || union.get(union.size() -1) != b[j]){
                    
                    union.add(b[j]);
                    
                    
                    
                }
                j++;  
            }
            // both values are equal
            else {
                
                if(union.isEmpty() || union.get(union.size() -1) != b[j]){
                    
                    union.add(b[j]);

                }  
                i++;
                j++;

            }
        }
        
        // Add Remaining elements :
        
        while(i < m){
            
            if(union.isEmpty() || union.get(union.size() -1) != a[i]){
                    
                    union.add(a[i]);
                    
                }
                i++;
            
        }
        while(j < n){
            if(union.isEmpty() || union.get(union.size() -1) != b[j]){
                    
                    union.add(b[j]);
                }
                j++;
            
        }
        return union;
        
        
    }
    
}
