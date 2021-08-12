package leetcode;

import java.util.ArrayList;
import java.util.List;

@BeatsPercent(100)
@TimeComplexity(worst = Complexity.QUADRATIC_N)
@SpaceComplexity(worst = Complexity.LINEAR_N)
public class Problem784 {
    public List<String> letterCasePermutation(String s) {
        List<String> ans = new ArrayList<>();
        collect(s.toCharArray(), 0, new StringBuilder(), ans);
        return ans;
    }

    private void collect(char[] s, int start, StringBuilder sb, List<String> ans) {
        if (sb.length() == s.length) {
            ans.add(sb.toString());
            return;
        }
        char c = s[start];
        sb.append(c);
        collect(s, start + 1, sb, ans);
        sb.setLength(sb.length() - 1);

        if (c >= '0' && c <= '9') {
            return;
        }
        sb.append(Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c));
        collect(s, start + 1, sb, ans);
        sb.setLength(sb.length() - 1);
    }
}
