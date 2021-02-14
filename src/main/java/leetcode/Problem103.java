package leetcode;

import java.util.*;

public class Problem103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }
        List<List<Integer>> result = new ArrayList<>();
        insert(root, 0, result);
        return result;
    }

    private static void insert(TreeNode current, int level, List<List<Integer>> result) {
        if (level >= result.size()) {
            LinkedList<Integer> nextLevel = new LinkedList<>();
            nextLevel.add(current.val);
            result.add(nextLevel);
        } else {
            if (level % 2 == 0) {
                result.get(level).add(current.val);
            } else {
                result.get(level).add(0, current.val);
            }
        }
        if (current.left != null) {
            insert(current.left, level + 1, result);
        }
        if (current.right != null) {
            insert(current.right, level + 1, result);
        }
    }
}
