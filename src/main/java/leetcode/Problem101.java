package leetcode;

@Difficulty(Level.EASY)
@Algorithms(Algorithm.DEPTH_FIRST_SEARCH)
@BeatsPercent(100)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.LINEAR_N) // depth of the stack
public class Problem101 {
    public boolean isSymmetric(TreeNode root) {
        return root == null || dfs(root.left, root.right);
    }

    private boolean dfs(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null || left.val != right.val) {
            return false;
        }
        return dfs(left.left, right.right) && dfs(left.right, right.left);
    }
}
