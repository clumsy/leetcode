package leetcode;

public class Problem701 {
    public static TreeNode insertIntoBST(TreeNode root, int val) {
        if (val > root.val) {
            if (root.right == null) {
                root.right = new TreeNode(val);
            } else {
                insertIntoBST(root.right, val);
            }
        } else {
            if (root.left == null) {
                root.left = new TreeNode(val);
            } else {
                insertIntoBST(root.left, val);
            }
        }
        return root;
    }
}
