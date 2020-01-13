package leetcode;

import java.util.Deque;
import java.util.LinkedList;

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

    public static TreeNode treeOf(Integer... values) {
        TreeNode root = new TreeNode(values[0]);
        Deque<TreeNode> queue = new LinkedList<>();
        queue.addLast(root);
        queue.addLast(null);
        int length = values.length;
        int index = 0;
        while (!queue.isEmpty()) {
            TreeNode current = queue.removeFirst();
            if (current != null) {
                if (++index < length && values[index] != null) {
                    current.left = new TreeNode(values[index]);
                    queue.addLast(current.left);
                }
                if (++index < length && values[index] != null) {
                    current.right = new TreeNode(values[index]);
                    queue.addLast(current.right);
                }
                if (index == length) {
                    return root;
                }
            } else {
                if (!queue.isEmpty()) {
                    queue.addLast(null);
                }
            }
        }
        return root;
    }
}
