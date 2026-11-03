// https://www.geeksforgeeks.org/problems/remove-all-occurrences-of-a-character-in-a-string/1

class Solution {
    public void removeCharacter(StringBuilder s, char c) {

        int i = 0;

        while (i < s.length()) {

            if (s.charAt(i) == c) {
                s.deleteCharAt(i);
            } 
            else {
                i++;
            }
        }
    }
}