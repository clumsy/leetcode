package leetcode;

public class Problem1026 {
    public int maxAncestorDiff(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return findMaxDiff(root, root.val, root.val);
    }

    private int findMaxDiff(TreeNode root, int min, int max) {
        int newMin = Math.min(min, root.val);
        int newMax = Math.max(max, root.val);
        int leftDiff = root.left != null ? findMaxDiff(root.left, newMin, newMax) : 0;
        int rightDiff = root.right != null ? findMaxDiff(root.right, newMin, newMax) : 0;
        int maxDiff = Math.max(leftDiff, rightDiff);
        return Math.max(newMax - newMin, maxDiff);
    }
}
