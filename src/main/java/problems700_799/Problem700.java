package problems700_799;

import lombok.Data;

public class Problem700 {

    @Data
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        private TreeNode(int x) { val = x; }
    }

    public static TreeNode treeOf(Integer... values) {
        int length = values.length;
        if (length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(values[0]);
        for (int i = 1; i < length; i++) {
            Integer value = values[i];
            if (value != null) {
                put(root, value);
            }
        }
        return root;
    }

    private static void put(TreeNode root, int value) {
        if (value < root.val) {
            if (root.left == null) {
                root.left = new TreeNode(value);
            } else {
                put(root.left, value);
            }
        } else {
            if (root.right == null) {
                root.right = new TreeNode(value);
            } else {
                put(root.right, value);
            }
        }
    }

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
