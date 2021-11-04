package leetcode;

import java.util.ArrayList;
import java.util.List;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.BACKTRACKING)
@BeatsPercent(100)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.LINEAR_N)
public class Problem784 {
    public List<String> letterCasePermutation(String s) {
        List<String> result = new ArrayList<>();
        collect(result, 0, s.toCharArray());
        return result;
    }

    private void collect(List<String> result, int i, char[] s) {
        if (i == s.length) {
            result.add(new String(s));
            return;
        }
        if (Character.isLetter(s[i])) {
            s[i] = Character.toLowerCase(s[i]);
            collect(result, i + 1, s);
            s[i] = Character.toUpperCase(s[i]);
        }
        collect(result, i + 1, s);
    }
}
