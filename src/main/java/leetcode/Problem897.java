package leetcode;

public class Problem897 {
    public TreeNode increasingBST(TreeNode root) {
        TreeNode newRoot = new TreeNode(root.val);
        TreeNode leftmost = newRoot;
        if (root.left != null) {
            leftmost = increasingBST(root.left);
        }
        TreeNode rightmost = leftmost;
        while (rightmost.right != null) {
            rightmost = rightmost.right;
        }
        if (rightmost != newRoot) {
            rightmost.right = newRoot;
            rightmost = rightmost.right;
        }
        if (root.right != null) {
            rightmost.right = increasingBST(root.right);
        }
        return leftmost;
    }
}
