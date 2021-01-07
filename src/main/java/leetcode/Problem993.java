package leetcode;

import java.util.ArrayDeque;
import java.util.Queue;

class Problem993 {
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> level = new ArrayDeque<>();
        level.offer(root);
        while (!level.isEmpty()) {
            int levelSize = level.size();
            boolean levelHasX = false;
            boolean levelHasY = false;
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = level.remove();
                if (node.val == x) {
                    levelHasX = true;
                } else if (node.val == y) {
                    levelHasY = true;
                }
                if (node.left != null && node.right != null &&
                        ((node.left.val == x && node.right.val == y) ||
                          node.left.val == y && node.right.val == x)) {
                    return false;
                }
                if (node.left != null) {
                    level.offer(node.left);
                }
                if (node.right != null) {
                    level.offer(node.right);
                }
            }
            if (levelHasX && levelHasY) {
                return true;
            }
        }
        return false;
    }
}
