package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Problem77 {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> results = new ArrayList<>();
        fill(results, new ArrayList<>(), n, k, 1);
        return results;
    }

    private void fill(List<List<Integer>> results, List<Integer> result, int n, int k, int from) {
        if (k == 0) {
            results.add(new ArrayList<>(result));
            return;
        }
        for (int i = from; i <= n; i++) {
            result.add(i);
            fill(results, result, n, k - 1, i + 1);
            result.remove(result.size() - 1);
        }
    }
}
