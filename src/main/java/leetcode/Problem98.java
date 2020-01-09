package leetcode;

public class Problem98 {
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isValidBST(root, null, null);
    }

    private boolean isValidBST(TreeNode root, Integer leftBound, Integer rightBound) {
        if ((rightBound != null && root.val >= rightBound) || (leftBound != null && root.val <= leftBound)) {
            return false;
        }
        if (root.left != null
                && !isValidBST(root.left, leftBound, rightBound != null ? Math.min(rightBound, root.val) : root.val)) {
            return false;
        }
        if (root.right != null
                && !isValidBST(root.right, leftBound != null ? Math.max(leftBound, root.val) : root.val, rightBound)) {
            return false;
        }
        return true;
    }
}
