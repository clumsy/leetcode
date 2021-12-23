package leetcode;

import java.util.Objects;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    
    TreeNode() {
        
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return (left != null ? left.val : null) + " ↙ " + val + " ↘ " + ((right != null ? right.val : null));
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