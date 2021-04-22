package leetcode;

@Algorithms(Algorithm.BINARY_TREE_MORRIS_TRAVERSAL)
@BeatsPercent(31.83)
@TimeComplexity(Complexity.LINEAR_N)
@SpaceComplexity(Complexity.CONSTANT)
public class Problem538 {
    public TreeNode convertBST(TreeNode root) {
        int sum = 0;
        TreeNode tourist = root;
        while (tourist != null) {
            if (tourist.right == null) {
                sum += tourist.val;
                tourist.val = sum;
                tourist = tourist.left;
            } else {
                TreeNode guide = tourist.right;
                while (guide.left != null && guide.left != tourist) {
                    guide = guide.left;
                }
                if (guide.left == null) {
                    guide.left = tourist;
                    tourist = tourist.right;
                } else {
                    guide.left = null;
                    sum += tourist.val;
                    tourist.val = sum;
                    tourist = tourist.left;
                }
            }
        }
        return root;
    }
}
