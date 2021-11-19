package leetcode;

import java.util.ArrayList;
import java.util.List;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.BACKTRACKING)
@BeatsPercent(100)
@TimeComplexity(worst = Complexity.TWO_TO_N)
@SpaceComplexity(worst = Complexity.LINEAR_N)
public class Problem22 {
    public List<String> generateParenthesis(int n) {
        return dfs(new ArrayList<>(), new StringBuilder(), n, 0);
    }

    private List<String> dfs(List<String> result, StringBuilder current, int n, int open) {
        if (n == 0 && open == 0) {
            result.add(current.toString());
            return result;
        }
        if (n > 0) {
            dfs(result, current.append("("), n - 1, open + 1);
            current.setLength(current.length() - 1);
        }
        if (open > 0) {
            dfs(result, current.append(")"), n, open - 1);
            current.setLength(current.length() - 1);
        }
        return result;
    }
}
