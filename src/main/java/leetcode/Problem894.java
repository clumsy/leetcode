package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.RECURSION)
@BeatsPercent(99.40)
@TimeComplexity(worst = Complexity.EXPONENTIAL_N)
@SpaceComplexity(worst = Complexity.EXPONENTIAL_N)
public class Problem894 {
    public List<TreeNode> allPossibleFBT(int n) {
        return allPossibleFBT(n, new HashMap<>());
    }

    private List<TreeNode> allPossibleFBT(int n, Map<Integer, List<TreeNode>> cache) {
        if (n == 1) {
            return Collections.singletonList(new TreeNode(0));
        }
        List<TreeNode> cached = cache.get(n);
        if (cached != null) {
            return cached;
        }
        List<TreeNode> result = new ArrayList<>(n - 2);
        for (int i = 0; i < n - 2; i += 2) {
            for (TreeNode left : allPossibleFBT(1 + i, cache)) {
                for (TreeNode right : allPossibleFBT(n - 2 - i, cache)) {
                    result.add(new TreeNode(0, left, right));
                }
            }
        }
        cache.put(n, result);
        return result;
    }
}
