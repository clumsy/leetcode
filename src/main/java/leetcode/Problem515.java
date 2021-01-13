package leetcode;

import java.util.*;

public class Problem515 {
    public List<Integer> largestValues(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }
        Queue<TreeNode> nodes = new ArrayDeque<>();
        nodes.add(root);
        List<Integer> result = new ArrayList<>();
        while (!nodes.isEmpty()) {
            int size = nodes.size();
            int max = nodes.peek().val;
            while (size-- > 0) {
                TreeNode node = nodes.remove();
                max = Math.max(max, node.val);
                if (node.left != null) {
                    nodes.add(node.left);
                }
                if (node.right != null) {
                    nodes.add(node.right);
                }
            }
            result.add(max);
        }
        return result;
    }
}
