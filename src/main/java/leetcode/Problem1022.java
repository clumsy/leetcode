package leetcode;

public class Problem1022 {
    public int sumRootToLeaf(TreeNode root) {
        return sum(root, 0);
    }

    private int sum(TreeNode root, int mask) {
        if (root.left == null && root.right == null) {
            return mask << 1 | root.val;
        }
        int newMask = mask << 1 | root.val;
        int leftSum = 0;
        if (root.left != null) {
            leftSum = sum(root.left, newMask);
        }
        int rightSum = 0;
        if (root.right != null) {
            rightSum = sum(root.right, newMask);
        }
        return leftSum + rightSum;
    }
}
