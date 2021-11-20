package leetcode;

@Difficulty(Level.EASY)
@Algorithms(Algorithm.BINARY_TREE_MORRIS_TRAVERSAL)
@BeatsPercent(100)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem783 {
    public int minDiffInBST(TreeNode root) {
        int min = Integer.MAX_VALUE;
        TreeNode prev = null;
        while (root != null) {
            if (root.left == null) {
                if (prev != null) {
                    min = Math.min(min, Math.abs(root.val - prev.val));
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
                    if (prev != null) {
                        min = Math.min(min, Math.abs(root.val - prev.val));
                    }
                    prev = root;
                    root = root.right;
                }
            }
        }
        return min;
    }
}
