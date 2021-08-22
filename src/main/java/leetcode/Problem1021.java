package leetcode;

@BeatsPercent(98.30)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem1021 {
    public String removeOuterParentheses(String s) {
        int open = 0;
        StringBuilder result = new StringBuilder(s.length());
        for (char c : s.toCharArray()) {
            boolean shouldAppend =
                (c == '(' && ++open > 1) ||
                (c == ')' && --open > 0);
            if (shouldAppend) {
                result.append(c);
            }
        }
        return result.toString();
    }
}
