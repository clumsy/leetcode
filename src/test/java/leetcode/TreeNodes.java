package leetcode;

public class TreeNodes {
    public static TreeNode bstOf(Integer... values) {
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

    public static TreeNode treeOf(int x) {
        return treeOf(x, null, null);
    }

    public static TreeNode treeOf(int x, TreeNode left, TreeNode right) {
        TreeNode result = new TreeNode(x);
        result.left = left;
        result.right = right;
        return result;
    }
}
