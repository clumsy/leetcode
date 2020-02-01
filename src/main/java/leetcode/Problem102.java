package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Problem102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        addLevel(root, 0, result);
        return result;
    }

    private void addLevel(TreeNode node, int level, List<List<Integer>> result) {
        if (node == null) {
            return;
        }
        List<Integer> current = null;
        if (result.size() <= level) {
            current = new ArrayList<>();
            result.add(current);
        } else {
            current = result.get(level);
        }
        current.add(node.val);
        addLevel(node.left, level + 1, result);
        addLevel(node.right, level + 1, result);
    }
}
