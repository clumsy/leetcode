package leetcode;

import java.util.*;

public class Problem113 {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if (root == null) {
            return Collections.emptyList();
        }
        List<List<Integer>> result = new ArrayList<>();
        doFindPathSum(root, sum, new ArrayList<>(), result);
        return result;
    }

    private static void doFindPathSum(TreeNode current, int currentRemains, List<Integer> resultItem, List<List<Integer>> result) {
        int remains = currentRemains - current.val;
        resultItem.add(current.val);
        if (remains == 0 && current.left == null && current.right == null) {
            result.add(new ArrayList<>(resultItem));
        } else {
            if (current.left != null) {
                doFindPathSum(current.left, remains, resultItem, result);
            }
            if (current.right != null) {
                doFindPathSum(current.right, remains, resultItem, result);
            }
        }
        resultItem.remove(resultItem.size() - 1);
    }
}
