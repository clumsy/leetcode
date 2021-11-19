package leetcode;

import java.util.ArrayList;
import java.util.List;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.BACKTRACKING)
@BeatsPercent(100)
@TimeComplexity(worst = Complexity.FOUR_TO_N)
@SpaceComplexity(worst = Complexity.LINEAR_N)
public class Problem17 {
    private static final String[] LETTERS = {
               "abc", "def",
        "ghi", "jkl", "mno",
        "pqrs", "tuv", "wxyz"
    };

    public List<String> letterCombinations(String digits) {
        return dfs(new ArrayList<>(), new StringBuilder(), digits);
    }

    private List<String> dfs(List<String> result, StringBuilder current, String digits) {
        if (digits.isEmpty()) {
            if (current.length() > 0) {
                result.add(current.toString());
            }
            return result;
        }
        String next = digits.substring(1);
        for (char c : LETTERS[digits.charAt(0) - '2'].toCharArray()) {
            dfs(result, current.append(c), next);
            current.setLength(current.length() - 1);
        }
        return result;
    }
}
