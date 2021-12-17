package leetcode;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.BINARY_TREE_MORRIS_TRAVERSAL)
@BeatsPercent(100)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem1038 {
    public TreeNode bstToGst(TreeNode root) {
        int offset = 0;
        TreeNode parent = root;
        while (parent != null) {
            if (parent.right == null) {
                // process parent
                parent.val += offset;
                offset = parent.val;
                //
                parent = parent.left;
            } else {
                TreeNode current = parent.right;
                while (current.left != null && current.left != parent) {
                    current = current.left;
                }
                if (current.left == null) {
                    current.left = parent;
                    parent = parent.right;
                } else {
                    current.left = null;
                    // process parent
                    parent.val += offset;
                    offset = parent.val;
                    //
                    parent = parent.left;
                }
            }
        }
        return root;
    }
}
