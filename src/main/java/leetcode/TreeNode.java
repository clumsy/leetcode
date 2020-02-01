package leetcode;

import java.util.Objects;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        return left + " ← " + val + " → " + right;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof TreeNode)) {
            return false;
        }
        TreeNode root = this;
        TreeNode other = (TreeNode) obj;
        if (root == other) {
            return true;
        }
        if (root.val != other.val) {
            return false;
        }
        return Objects.equals(root.left, other.left) && Objects.equals(root.right, other.right);
    }
}