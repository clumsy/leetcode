package leetcode;

public class Problem979 {
    public int distributeCoins(TreeNode root) {
        return distribute(null, root);
    }

    private int distribute(TreeNode parent, TreeNode current) {
        int moves = 0;
        if (current.left != null) {
            moves += distribute(current, current.left);
        }
        if (current.right != null) {
            moves += distribute(current, current.right);
        }
        if (parent == null) {
            return moves;
        }
        if (current.val > 1) {
            int diff = current.val - 1;
            moves += diff;
            parent.val += diff;
            current.val = 1;
        } else if (current.val < 1) {
            int diff = 1 - current.val;
            moves += diff;
            parent.val -= diff;
            current.val = 1;
        }
        return moves;
    }
}
