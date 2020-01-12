package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Problem40 {
    public static final class Alternative extends Problem40 {

        @Override
        public List<List<Integer>> combinationSum2(int[] candidates, int target) {
            Arrays.sort(candidates);
            int length = candidates.length;
            int[] counts = new int[length];
            int k = 0;
            for (int i = 0; i < length;) {
                int count = 1;
                int candidate = candidates[i];
                while (++i < length && candidate == candidates[i]) {
                    count++;
                }
                candidates[k] = candidate;
                counts[k++] = count;
            }
            return getCandidates(candidates, counts, new int[k], 0, k, target);
        }

        private List<List<Integer>> getCandidates(int[] candidates, int[] counts, int[] currentCounts,
                                                  int offset, int length, int target) {
            List<List<Integer>> result = new ArrayList<>();
            for (int i = offset; i < length; i++) {
                int candidate = candidates[i];
                int diff = target - candidate;
                if (diff < 0) {
                    break;
                }
                currentCounts[i]++;
                if (diff == 0) {
                    result.add(Collections.singletonList(candidate));
                } else if (diff >= candidate) {
                    for (List<Integer> numbers : getCandidates(candidates, counts, currentCounts.clone(),
                            counts[i] > currentCounts[i] ? i : i + 1, length, diff)) {
                        List<Integer> current = new ArrayList<>(numbers.size() + 1);
                        current.add(candidate);
                        current.addAll(numbers);
                        result.add(current);
                    }
                }
            }
            return result;
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        checkCombinations(candidates, target, current, 0, result);
        return result;
    }

    private void checkCombinations(int[] candidates, int target, List<Integer> current,
                                   int offset, List<List<Integer>> result) {
        for (int i = offset; i < candidates.length; i++) {
            int candidate = candidates[i];
            if (i > offset && candidate == candidates[i - 1]) {
                continue;
            }
            int diff = target - candidate;
            if (diff == 0) {
                List<Integer> match = new ArrayList<>(current);
                match.add(candidate);
                result.add(match);
                break;
            }
            if (diff > 0) {
                current.add(candidate);
                checkCombinations(candidates, diff, current, i + 1, result);
                current.remove(current.size() - 1);
            }
        }
    }
}
