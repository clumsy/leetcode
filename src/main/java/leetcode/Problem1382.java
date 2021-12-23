package leetcode;

import java.util.ArrayList;
import java.util.List;

@Difficulty(Level.MEDIUM)
@Algorithms({Algorithm.BINARY_TREE_MORRIS_TRAVERSAL, Algorithm.RECURSION})
@BeatsPercent(35.21)
@TimeComplexity(worst = Complexity.LINEAR_N)
@ToDo("Can do O(1) worst-case space complexity via Day–Stout–Warren algorithm")
@SpaceComplexity(worst = Complexity.LINEAR_N)
public class Problem1382 {
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> in_order = new ArrayList<>();
        while (root != null) {
            if (root.left == null) {
                in_order.add(root.val);
                root = root.right;
            } else {
                TreeNode current = root.left;
                while (current.right != null && current.right != root) {
                    current = current.right;
                }
                if (current.right == null) {
                    current.right = root;
                    root = root.left;
                } else {
                    current.right = null;
                    in_order.add(root.val);
                    root = root.right;
                }
            }
        }
        return balanced_tree(in_order, 0, in_order.size() - 1);
    }

    private TreeNode balanced_tree(List<Integer> in_order, int start, int end) {
        if (start > end) {
            return null;
        }
        int middle = start + (end - start)/2;
        TreeNode root = new TreeNode(in_order.get(middle));
        root.left = balanced_tree(in_order, start, middle - 1);
        root.right = balanced_tree(in_order, middle + 1, end);
        return root;
    }
}
