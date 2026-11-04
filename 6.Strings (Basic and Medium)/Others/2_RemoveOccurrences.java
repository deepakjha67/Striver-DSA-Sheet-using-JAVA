// https://www.geeksforgeeks.org/problems/remove-all-occurrences-of-a-character-in-a-string/1

class Solution {

    public void removeCharacter(StringBuilder s, char c) {

        // Start checking the string from index 0
        int i = 0;

        // Continue until we reach the end of the StringBuilder
        while (i < s.length()) {

            // Check whether the current character matches the character to be removed
            if (s.charAt(i) == c) {

                // If it matches, remove the character at index i
                s.deleteCharAt(i);

                // IMPORTANT:
                // Don't increment i here.
                // After deletion, the next character automatically shifts
                // into the current index i.
                // So, we need to check that same index again.

            } 
            else {

                // If the current character doesn't match c,
                // move to the next index.
                i++;
            }
        }
    }
}