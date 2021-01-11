package leetcode;

public class Problem1448 {
    public int goodNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return countGoodNodes(root, Integer.MIN_VALUE);
    }

    private int countGoodNodes(TreeNode root, int parentValue) {
        int leftCount = root.left != null ? countGoodNodes(root.left, Math.max(root.val, parentValue)) : 0;
        int rightCount = root.right != null ? countGoodNodes(root.right, Math.max(root.val, parentValue)) : 0;
        return root.val >= parentValue ? 1 + leftCount + rightCount : leftCount + rightCount;
    }
}
