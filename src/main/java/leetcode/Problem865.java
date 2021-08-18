package leetcode;

@Algorithms(Algorithm.DEPTH_FIRST_SEARCH)
@BeatsPercent(100)
@TimeComplexity(Complexity.LINEAR_N) // where N is the number of nodes
@SpaceComplexity(Complexity.LINEAR_K) // where K is the depth of the tree
public class Problem865 {
    private int maxDepth = Integer.MIN_VALUE;
    private TreeNode ans;

    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        dfs(root, 0);
        return ans;
    }

    private int dfs(TreeNode current, int depth) {
        if (current == null) {
            return depth;
        }
        int left  = dfs(current.left,  depth + 1);
        int right = dfs(current.right, depth + 1);
        if (left == right && left >= maxDepth) {
            ans = current;
            maxDepth = left;
            return maxDepth;
        }
        return Math.max(left, right);
    }
}
