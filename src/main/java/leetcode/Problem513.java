package leetcode;

import java.util.ArrayDeque;
import java.util.Queue;

public class Problem513 {
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> nodes = new ArrayDeque<>();
        nodes.add(root);
        int leftmost = 0;
        while (!nodes.isEmpty()) {
            int size = nodes.size();
            leftmost = nodes.peek().val;
            while (size-- > 0) {
                TreeNode node = nodes.remove();
                if (node.left != null) {
                    nodes.add(node.left);
                }
                if (node.right != null) {
                    nodes.add(node.right);
                }
            }
        }
        return leftmost;
    }
}
