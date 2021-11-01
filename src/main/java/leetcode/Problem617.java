package leetcode;

@Difficulty(Level.EASY)
@Algorithms(Algorithm.DEPTH_FIRST_SEARCH)
@BeatsPercent(100)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.LINEAR_N)
public class Problem617 {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return null;
        }
        if (root1 != null && root2 != null) {
            root1.val += root2.val;
            root1.left = mergeTrees(root1.left, root2.left);
            root1.right = mergeTrees(root1.right, root2.right);
            return root1;
        }
        if (root1 == null) {
            root1 = root2;
        }
        return root1;
    }
}
