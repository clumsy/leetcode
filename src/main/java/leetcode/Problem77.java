package leetcode;

import java.util.ArrayList;
import java.util.List;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.RECURSION)
@BeatsPercent(92.23)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem77 {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        if (k > n || k < 0) {
            return result;
        }
        if (k == 0) {
            result.add(new ArrayList<>());
            return result;
        }
        result = combine(n - 1, k - 1);
        for (List<Integer> prev : result) {
            prev.add(n); // with n
        }
        result.addAll(combine(n - 1, k)); // without n
        return result;
    }
}
