// https://www.geeksforgeeks.org/problems/palindrome-string0817/1

class Solution {
    boolean isPalindrome(String s) {
        // code here
        int i = 0;
        int n = s.length();
        int j = n-1;
        
        boolean ans = true;
        
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                
                ans = false;
            }
            i++;
            j--;
        }
        return ans;
    }
}