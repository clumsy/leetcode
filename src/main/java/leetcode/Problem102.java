package leetcode;

import java.util.ArrayList;
import java.util.List;

@Difficulty(Level.MEDIUM)
@BeatsPercent(100)
@Algorithms(Algorithm.LEVEL_ORDER_TRAVERSAL)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.LINEAR_N) // depth of the stack
public class Problem102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        return dfs(new ArrayList<>(), root, 0);
    }

    private List<List<Integer>> dfs(List<List<Integer>> result, TreeNode root, int depth) {
        if (root == null) {
            return result;
        }
        if (result.size() < depth + 1) {
            result.add(new ArrayList<>());
        }
        result.get(depth).add(root.val);
        dfs(result, root.left, depth + 1);
        dfs(result, root.right, depth + 1);
        return result;
    }
}
