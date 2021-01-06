package leetcode;

import java.util.ArrayDeque;
import java.util.Queue;

public class Problem965 {
    public boolean isUnivalTree(TreeNode root) {
        Queue<TreeNode> nodes = new ArrayDeque<>();
        nodes.add(root);
        while (!nodes.isEmpty()) {
            TreeNode node = nodes.remove();
            if (node.val != root.val) {
                return false;
            }
            if (node.left != null) {
                nodes.offer(node.left);
            }
            if (node.right != null) {
                nodes.offer(node.right);
            }
        }
        return true;
    }
}
