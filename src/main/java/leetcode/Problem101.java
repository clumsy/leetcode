package leetcode;

public class Problem101 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return doCheckIsSymmetric(root.left, root.right);
    }

    private boolean doCheckIsSymmetric(TreeNode first, TreeNode second) {
        if (first == second && first == null) {
            return true;
        }
        if (first == null) {
            return false;
        }
        if (second == null) {
            return false;
        }
        if (first.val != second.val) {
            return false;
        }
        return doCheckIsSymmetric(first.left, second.right) && doCheckIsSymmetric(first.right, second.left);
    }
}
