package leetcode;

import java.util.ArrayList;
import java.util.List;

@Difficulty(Level.EASY)
@Algorithms(Algorithm.RECURSION)
@BeatsPercent(95.52)
@TimeComplexity(Complexity.LINEAR_N)
@SpaceComplexity(Complexity.LINEAR_N)
public class Problem46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        for (int num : nums) {
            List<List<Integer>> next = new ArrayList<>();
            for (List<Integer> permutation : result) {
                for (int i = 0, n = permutation.size(); i <= n; i++) {
                    List<Integer> perm = new ArrayList<>(n + 1);
                    perm.addAll(permutation.subList(0, i));
                    perm.add(num);
                    perm.addAll(permutation.subList(i, n));
                    next.add(perm);
                }
            }
            result = next;
        }
        return result;
    }
}
