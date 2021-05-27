package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Problem216 {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        fill(1, k, n, current, result);
        return result;
    }

    private void fill(int offset, int k, int n, List<Integer> current, List<List<Integer>> result) {
        if (k == 0 && n == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        if (k <= 0) {
            return;
        }
        for (int max = Math.min(n, 9), i = k > 1 ? offset : Math.max(max, offset); i <= max; i++) {
            current.add(i);
            fill(i + 1, k - 1, n - i, current, result);
            current.remove(current.size() - 1);
        }
    }
}
