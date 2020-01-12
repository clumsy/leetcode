package leetcode;

import java.util.*;

public class Problem39 {
    public static class Alternative extends Problem39 {

        @Override
        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            Arrays.sort(candidates);
            List<List<Integer>> result = new ArrayList<>();
            Map<Integer, List<List<Integer>>> current = new HashMap<>(candidates.length, 1f);
            for (int candidate : candidates) {
                if (candidate > target) {
                    break;
                }
                List<Integer> item = Collections.singletonList(candidate);
                if (candidate == target) {
                    result.add(item);
                } else {
                    current.put(candidate, Collections.singletonList(item));
                }
            }
            while (!current.isEmpty()) {
                Map<Integer, List<List<Integer>>> next = new HashMap<>();
                for (Integer currentSum : current.keySet()) {
                    for (List<Integer> currentNumbers : current.get(currentSum)) {
                        int last = currentNumbers.get(currentNumbers.size() - 1);
                        int start = Arrays.binarySearch(candidates, last);
                        for (int i = start; i < candidates.length; i++) {
                            int candidate = candidates[i];
                            int sum = currentSum + candidate;
                            if (sum > target) {
                                break;
                            }
                            List<Integer> numbers = new ArrayList<>(currentNumbers);
                            numbers.add(candidate);
                            if (sum == target) {
                                result.add(numbers);
                            } else {
                                next.compute(sum, (k, v) -> {
                                    if (v == null) {
                                        v = new ArrayList<>();
                                    }
                                    v.add(numbers);
                                    return v;
                                });
                            }
                        }
                    }
                }
                current = next;
            }
            return result;
        }
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        return getCandidates(candidates, 0, target);
    }

    private List<List<Integer>> getCandidates(int[] candidates, int offset, int target) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = offset, count = candidates.length; i < count; i++) {
            int candidate = candidates[i];
            int diff = target - candidate;
            if (diff < 0) {
                break;
            }
            if (diff == 0) {
                result.add(Collections.singletonList(candidate));
            } else if (diff >= candidate) {
                for (List<Integer> numbers : getCandidates(candidates, i, diff)) {
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
