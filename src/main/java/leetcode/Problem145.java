package leetcode;

import java.util.ArrayList;
import java.util.List;

@Difficulty(Level.EASY)
@Algorithms(Algorithm.DEPTH_FIRST_SEARCH)
@BeatsPercent(100)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        return dfs(new ArrayList<>(), root);
    }

    private List<Integer> dfs(List<Integer> result, TreeNode root) {
        if (root != null) {
            dfs(result, root.left);
            dfs(result, root.right);
            result.add(root.val);
        }
        return result;
    }
}
