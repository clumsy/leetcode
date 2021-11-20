package leetcode;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.RECURSION)
@BeatsPercent(37.30)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem98 {
    public boolean isValidBST(TreeNode root) {
        TreeNode prev = null;
        while (root != null) {
            if (root.left == null) {
                if (prev != null && prev.val >= root.val) {
                    return false;
                }
                prev = root;
                root = root.right;
            } else {
                TreeNode predecessor = root.left;
                while (predecessor.right != null && predecessor.right != root) {
                    predecessor = predecessor.right;
                }
                if (predecessor.right == null) {
                    predecessor.right = root;
                    root = root.left;
                } else {
                    predecessor.right = null;
                    if (prev != null && prev.val >= root.val) {
                        return false;
                    }
                    prev = root;
                    root = root.right;
                }
            }
        }
        return true;
    }
}
