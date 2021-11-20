package leetcode;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.BINARY_TREE_MORRIS_TRAVERSAL)
@BeatsPercent(31.83)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem538 {
    public TreeNode convertBST(TreeNode root) {
        int sum = 0;
        TreeNode current = root;
        while (current != null) {
            if (current.right == null) {
                sum += current.val;
                current.val = sum;
                current = current.left;
            } else {
                TreeNode predecessor = current.right;
                while (predecessor.left != null && predecessor.left != current) {
                    predecessor = predecessor.left;
                }
                if (predecessor.left == null) {
                    predecessor.left = current;
                    current = current.right;
                } else {
                    predecessor.left = null;
                    sum += current.val;
                    current.val = sum;
                    current = current.left;
                }
            }
        }
        return root;
    }
}
