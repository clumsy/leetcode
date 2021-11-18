package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.BACKTRACKING)
@BeatsPercent(99.01)
@TimeComplexity(worst = Complexity.TWO_TO_N) // where N is the number of candidates
@SpaceComplexity(worst = Complexity.LINEAR_K) // where K is target
public class Problem40 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        return combinationSum2(new ArrayList<>(), new ArrayList<>(), candidates, 0, target);
    }

    private List<List<Integer>> combinationSum2(List<List<Integer>> result, List<Integer> current, int[] candidates, int start, int target) {
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return result;
        }
        for (int i = start; i < candidates.length && candidates[i] <= target; i++) {
            if (candidates[i] == 0 || (i > 0 && candidates[i] == candidates[i - 1])) {
                continue;
            }
            int candidate = candidates[i];
            candidates[i] = 0;
            current.add(candidate);
            combinationSum2(result, current, candidates, i + 1, target - candidate);
            current.remove(current.size() - 1);
            candidates[i] = candidate;
        }
        return result;
    }
}
