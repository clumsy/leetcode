package leetcode;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.BINARY_TREE_MORRIS_TRAVERSAL)
@BeatsPercent(100)
@TimeComplexity(worst = Complexity.N_PLUS_K) // where N is the tree height
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem230 {
    
    // The recursion first gets all the way do the left branch (height of the tree elements)
    // Then it goes up K times to find the answer
    public int kthSmallest(TreeNode root, int k) {
        TreeNode parent = root;
        while (parent != null) {
            if (parent.left == null) {
                if (--k == 0) {
                    return parent.val;
                }
                parent = parent.right;
            } else {
                TreeNode current = parent.left;
                while (current.right != null && current.right != parent) {
                    current = current.right;
                }
                if (current.right == null) {
                    current.right = parent;
                    parent = parent.left;
                } else {
                    current.right = null;
                    if (--k == 0) {
                        return parent.val;
                    }
                    parent = parent.right;
                }
            }
        }
        throw new RuntimeException(); // we will always have an answer
    }
}
