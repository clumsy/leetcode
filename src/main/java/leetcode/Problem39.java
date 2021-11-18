package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.DEPTH_FIRST_SEARCH)
@BeatsPercent(99.05)
@TimeComplexity(worst = Complexity.N_TO_K) // where K is target
@SpaceComplexity(worst = Complexity.LINEAR_K)
public class Problem39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        return combinationSum(new ArrayList<>(), new ArrayList<>(), candidates, target, 0);
    }

    private List<List<Integer>> combinationSum(List<List<Integer>> result, List<Integer> current, int[] candidates, int target, int start) {
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return result;
        }
        for (int i = start; i < candidates.length && candidates[i] <= target; i++) {
            current.add(candidates[i]);
            combinationSum(result, current, candidates, target - candidates[i], i);
            current.remove(current.size() - 1);
        }
        return result;
    }
}
