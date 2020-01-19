package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Problem22 {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generate(0, n, new StringBuilder(), result);
        return result;
    }

    private void generate(int openCount, int canOpen, StringBuilder current, List<String> result) {
        if (openCount == 0 && canOpen == 0) {
            result.add(current.toString());
            return;
        }
        if (canOpen > 0) {
            generate(openCount + 1, canOpen - 1, current.append('('), result);
            current.setLength(current.length() - 1);
        }
        if (openCount > 0) {
            generate(openCount - 1, canOpen, current.append(')'), result);
            current.setLength(current.length() - 1);
        }
    }
}
