package leetcode;

@BeatsPercent(100)
@Algorithms(Algorithm.DIVIDE_AND_CONQUER)
@TimeComplexity(Complexity.LOG_N_SQUARED)
@SpaceComplexity(Complexity.LOGARITHMIC_N)
public class Problem222 {
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }

        TreeNode left = root;
        int left_depth = 0;
        while (left != null) {
            left = left.left;
            left_depth++;
        }

        TreeNode right = root;
        int right_depth = 0;
        while (right != null) {
            right = right.right;
            right_depth++;
        }

        if (left_depth == right_depth) {
            return (int) Math.pow(2, left_depth) - 1;
        }

        return 1 + countNodes(root.left) + countNodes(root.right);
    }
}
