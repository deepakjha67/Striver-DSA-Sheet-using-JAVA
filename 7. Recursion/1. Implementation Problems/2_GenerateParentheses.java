import java.util.*;

class Solution {

    public List<String> generateParentheses(int n) {

        List<String> result = new ArrayList<>();

        // Odd number of parentheses is not possible
        if (n % 2 != 0) {
            return result;
        }

        // Generate valid combinations using n/2 pairs
        generate("", n / 2, 0, 0, result);

        return result;
    }

    private void generate(String curr, int n, int open, int close,
                          List<String> result) {

        // Base case: all parentheses are used
        if (curr.length() == 2 * n) {
            result.add(curr);
            return;
        }

        // Add '(' if we haven't used all opening brackets
        if (open < n) {
            generate(curr + "(", n, open + 1, close, result);
        }

        // Add ')' only if there is an unmatched '('
        if (close < open) {
            generate(curr + ")", n, open, close + 1, result);
        }
    }
}