package leetcode;

public class Problem1315 {
    public int sumEvenGrandparent(TreeNode root) {
        return sumEvenGrandparent(root, false, false);
    }

    private int sumEvenGrandparent(TreeNode root, boolean evenGrandparent, boolean evenParent) {
        if (root == null) {
            return 0;
        }
        boolean isEven = root.val % 2 == 0;
        int leftSum = root.left != null ? sumEvenGrandparent(root.left, evenParent, isEven) : 0;
        int rightSum = root.right != null ? sumEvenGrandparent(root.right, evenParent, isEven) : 0;
        return evenGrandparent ? leftSum + rightSum + root.val : leftSum + rightSum;
    }
}
