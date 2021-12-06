package leetcode;

import java.util.ArrayList;
import java.util.List;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.DEPTH_FIRST_SEARCH)
@BeatsPercent(99.93)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.LINEAR_N) // the stack depth
public class Problem113 {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        return dfs(root, targetSum, new ArrayList<>(), new ArrayList<>());
    }

    private List<List<Integer>> dfs(TreeNode root, int targetSum, List<List<Integer>> result, List<Integer> path) {
        if (root == null) {
            return result;
        }
        path.add(root.val);
        targetSum -= root.val;
        if (root.left == null && root.right == null) {
            if (targetSum == 0) {
                result.add(new ArrayList<>(path));
            }
        } else {
            dfs(root.right, targetSum, result, path);
            dfs(root.left, targetSum, result, path);
        }
        path.remove(path.size() - 1);
        return result;
    }
}
