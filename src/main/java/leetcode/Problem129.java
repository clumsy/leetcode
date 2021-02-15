package leetcode;

public class Problem129 {
    public int sumNumbers(TreeNode root) {
        return sum(root, 0, 0);
    }

    private int sum(TreeNode root, int current, int sum) {
        if (root == null) {
            return sum;
        }
        current = current*10 + root.val;
        if (root.left == null && root.right == null) {
            return current + sum;
        }
        if (root.left != null) {
            sum = sum(root.left, current, sum);
        }
        if (root.right != null) {
            sum = sum(root.right, current, sum);
        }
        return sum;
    }
}
