package leetcode;

public class Problem32 {
    public int longestValidParentheses(String s) {
        int longest = 0;
        {
            int leftParens = 0;
            int rightParens = 0;
            for (int i = 0, length = s.length(); i < length; i++) {
                char ch = s.charAt(i);
                if (ch == '(') {
                    leftParens++;
                } else {
                    rightParens++;
                }
                if (leftParens == rightParens) {
                    longest = Math.max(longest, 2 * rightParens);
                } else if (rightParens > leftParens) {
                    leftParens = 0;
                    rightParens = 0;
                }
            }
        }
        {
            int leftParens = 0;
            int rightParens = 0;
            for (int i = s.length() - 1; i >= 0; i--) {
                char ch = s.charAt(i);
                if (ch == '(') {
                    leftParens++;
                } else {
                    rightParens++;
                }
                if (leftParens == rightParens) {
                    longest = Math.max(longest, 2 * rightParens);
                } else if (leftParens > rightParens) {
                    leftParens = 0;
                    rightParens = 0;
                }
            }
        }
        return longest;
    }
}
