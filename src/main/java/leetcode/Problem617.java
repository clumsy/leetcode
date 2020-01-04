package leetcode;

public class Problem617 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        boolean noLeft = t1 == null;
        boolean noRight = t2 == null;
        if (noLeft && noRight) {
            return null;
        }
        if (noLeft) {
            return t2;
        }
        if (noRight) {
            return t1;
        }
        TreeNode result = new TreeNode(t1.val + t2.val);
        result.left = mergeTrees(t1.left, t2.left);
        result.right = mergeTrees(t1.right, t2.right);
        return result;
    }
}
