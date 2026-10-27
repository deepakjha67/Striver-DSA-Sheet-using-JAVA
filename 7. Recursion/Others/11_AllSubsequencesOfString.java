https://www.geeksforgeeks.org/problems/power-set4302/1

class Solution {
    
    static void getAllSubsequences(String s, int index, StringBuilder output, List<String> ans ){
        
        // Base case :
        
        if(index >= s.length()){
            
            // Subsequence ready
            String subsequence = output.toString();
            ans.add(subsequence);
            
            return;
        }
        // Solve one case :
        
        // include-exclude pattern
        
        char ch = s.charAt(index);
        
        // Include :
        output.append(ch);
        getAllSubsequences(s, index + 1, output, ans);
        
        //Exclude :
        output.deleteCharAt(output.length() -1);
        getAllSubsequences(s, index +1, output, ans);
        
    }
    public List<String> powerSet(String s) {
        // Code here
        
        
        // Subsequence = 2 ^ n
        // Include and exclude 
        
        List<String> ans = new ArrayList<>();
        StringBuilder output = new StringBuilder(); // mutable
        
        int index = 0;
        
        getAllSubsequences(s , index, output, ans);
        Collections.sort(ans);
       
        return ans;
    }
}