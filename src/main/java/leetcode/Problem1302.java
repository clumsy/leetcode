package leetcode;

import java.util.ArrayDeque;
import java.util.Queue;

public class Problem1302 {
    public int deepestLeavesSum(TreeNode root) {
        Queue<TreeNode> nodes = new ArrayDeque<>();
        nodes.add(root);
        int sum = 0;
        while (!nodes.isEmpty()) {
            int size = nodes.size();
            boolean hasNodesLevelBelow = false;
            sum = 0;
            while (size-- > 0) {
                TreeNode node = nodes.remove();
                boolean hasLeft = node.left != null;
                if (hasLeft) {
                    hasNodesLevelBelow = true;
                    nodes.offer(node.left);
                }
                boolean hasRight = node.right != null;
                if (hasRight) {
                    hasNodesLevelBelow = true;
                    nodes.offer(node.right);
                }
                sum += node.val;
            }
            if (!hasNodesLevelBelow) {
                break;
            }
        }
        return sum;
    }
}
