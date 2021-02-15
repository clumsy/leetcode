package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Problem51 {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        List<String> current = new ArrayList<>();
        addLevels(result, current, n);
        return result;
    }

    private void addLevels(List<List<String>> result, List<String> current, int n) {
        int level = current.size();
        if (level == n) {
            result.add(new ArrayList<>(current));
            return;
        }
        for (int i = 0; i < n; i++) {
            boolean violates = false;
            for (int k = 0; k < level; k++) {
                String row = current.get(k);
                if (row.charAt(i) == 'Q') {
                    violates = true;
                    break;
                }
                if (i - level + k >= 0 && row.charAt(i - level + k) == 'Q') {
                    violates = true;
                    break;
                }
                if (i + level - k < n && row.charAt(i + level - k) == 'Q') {
                    violates = true;
                    break;
                }

            }
            if (violates) {
                continue;
            }
            StringBuilder builder = new StringBuilder();
            for (int k = 0; k < n; k++) {
                builder.append(i == k ? 'Q' : '.');
            }
            current.add(builder.toString());
            addLevels(result, current, n);
            current.remove(level);
        }
    }
}
