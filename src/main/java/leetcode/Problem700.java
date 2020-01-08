package leetcode;

public class Problem700 {
    public static TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return null;
        }
        int result = val - root.val;
        if (result == 0) {
            return root;
        }
        if (result < 0) {
            return searchBST(root.left, val);
        }
        return searchBST(root.right, val);
    }
}
