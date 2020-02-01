package leetcode;

public class Problem114 {
    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            TreeNode right = root.right;
            root.right = root.left;
            TreeNode current = root.left;
            while (current.right != null) {
                current = current.right;
            }
            current.right = right;
            root.left = null;
        }
        flatten(root.left);
        flatten(root.right);
    }
}
