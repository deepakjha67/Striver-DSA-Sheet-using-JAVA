
import java.util.*;

class Solution {
    public List<String> generateParentheses(int n) {
        List<String> result = new ArrayList<>();

        if (n % 2 != 0) {
            return result;
        }

        generate("", n / 2, 0, 0, result);
        return result;
    }

    private void generate(String curr, int n, int open, int close,
                          List<String> result) {
        if (curr.length() == 2 * n) {
            result.add(curr);
            return;
        }

        if (open < n) {
            generate(curr + "(", n, open + 1, close, result);
        }

        if (close < open) {
            generate(curr + ")", n, open, close + 1, result);
        }
    }
}
