package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem1110 {
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        Set<Integer> toRemove = new HashSet<>(to_delete.length, 1f);
        for (int remove : to_delete) {
            toRemove.add(remove);
        }
        List<TreeNode> forest = new ArrayList<>();
        deleteNodes(null, root, toRemove, forest);
        return forest;
    }

    private void deleteNodes(TreeNode parent, TreeNode root, Set<Integer> toRemove, List<TreeNode> forest) {
        if (root == null) {
            return;
        }
        boolean keep = !toRemove.contains(root.val);
        if (keep) {
            if (parent == null) {
                forest.add(root);
            }
        } else {
            if (parent != null) {
                if (parent.left != null && parent.left.val == root.val) {
                    parent.left = null;
                }
                if (parent.right != null && parent.right.val == root.val) {
                    parent.right = null;
                }
            }
        }

        if (root.left != null) {
            deleteNodes(keep ? root : null, root.left, toRemove, forest);
        }
        if (root.right != null) {
            deleteNodes(keep ? root : null, root.right, toRemove, forest);
        }
    }
}
