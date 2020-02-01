package leetcode;

public class Problem104 {
    public int maxDepth(TreeNode root) {
        return findMaxDepth(root, 0);
    }

    private int findMaxDepth(TreeNode node, int depth) {
        if (node == null) {
            return depth;
        }
        int leftDepth = findMaxDepth(node.left, depth + 1);
        int rightDepth = findMaxDepth(node.right, depth + 1);
        return Math.max(leftDepth, rightDepth);
    }
}
