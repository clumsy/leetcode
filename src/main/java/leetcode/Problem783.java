package leetcode;

@Algorithms(Algorithm.BINARY_TREE_MORRIS_TRAVERSAL)
@BeatsPercent(100)
@TimeComplexity(Complexity.LINEAR_N)
@SpaceComplexity(Complexity.CONSTANT)
public class Problem783 {
    public int minDiffInBST(TreeNode root) {
        int min = Integer.MAX_VALUE;
        TreeNode tourist = root;
        TreeNode prev = null;
        while (tourist != null) {
            if (tourist.left == null) {
                if (prev != null) {
                    min = Math.min(min, Math.abs(tourist.val - prev.val));
                }
                prev = tourist;
                tourist = tourist.right;
            } else {
                TreeNode guide = tourist.left;
                while (guide.right != null && guide.right != tourist) {
                    guide = guide.right;
                }
                if (guide.right == null) {
                    guide.right = tourist;
                    tourist = tourist.left;
                } else {
                    guide.right = null;
                    if (prev != null) {
                        min = Math.min(min, Math.abs(tourist.val - prev.val));
                    }
                    prev = tourist;
                    tourist = tourist.right;
                }
            }
        }
        return min;
    }
}
