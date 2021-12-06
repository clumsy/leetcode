package leetcode;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.DEPTH_FIRST_SEARCH)
@BeatsPercent(100)
@TimeComplexity(worst = Complexity.LINEAR_N) // where N is the depth of the BST
@SpaceComplexity(worst = Complexity.LINEAR_N) // the stack depth
public class Problem450 {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }
        if (root.val == key) {
            if (root.right == null || root.left == null) {
                return root.right != null ? root.right : root.left;
            }
            TreeNode current = root.right;
            while (current.left != null) {
                current = current.left;
            }
            current.left = root.left;
            return root.right;
        }
        if (root.val > key) {
            root.left = deleteNode(root.left, key);
        } else {
            root.right = deleteNode(root.right, key);
        }
        return root;
    }
}
