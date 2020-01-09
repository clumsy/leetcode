package leetcode;

public class Problem100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null) {
            return q == null;
        }
        if (q == null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        if (!isSameTree(p.left, q.left)) {
            return false;
        }
        if (!isSameTree(p.right, q.right)) {
            return false;
        }
        return true;
    }
}
