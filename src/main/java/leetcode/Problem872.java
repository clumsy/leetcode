package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Problem872 {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        return leafSequenceOf(root1).equals(leafSequenceOf(root2));
    }

    private List<Integer> leafSequenceOf(TreeNode root) {
        return findLeafSequenceOf(root, new ArrayList<>());
    }

    private List<Integer> findLeafSequenceOf(TreeNode root, List<Integer> sequence) {
        if (root.left == null && root.right == null) {
            sequence.add(root.val);
        }
        if (root.left != null) {
            findLeafSequenceOf(root.left, sequence);
        }
        if (root.right != null) {
            findLeafSequenceOf(root.right, sequence);
        }
        return sequence;
    }
}
