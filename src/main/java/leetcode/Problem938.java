package leetcode;

public class Problem938 {
    public static int rangeSumBST(TreeNode root, int L, int R) {
        int result = 0;
        boolean leftCheck = root.val >= L;
        if (leftCheck && root.left != null) {
            result += rangeSumBST(root.left, L, R);
        }
        if (root.val <= R) {
            if (root.right != null) {
                result += rangeSumBST(root.right, L, R);
            }
            if (leftCheck) {
                result += root.val;
            }
        }
        return result;
    }
}
