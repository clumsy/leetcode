package problems900_999.problem938;

import lombok.Data;

public class Problem938 {

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
