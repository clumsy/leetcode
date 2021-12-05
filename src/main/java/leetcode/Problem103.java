package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.IN_ORDER_TRAVERSAL)
@BeatsPercent(100)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.LINEAR_N) // the stack width
public class Problem103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        return solve(new ArrayList<>(), root, 0);
    }

    private List<List<Integer>> solve(List<List<Integer>> result, TreeNode root, int depth) {
        if (root == null) {
            return result;
        }
        if (result.size() < depth + 1) {
            result.add(new LinkedList<>());
        }
        if ((depth & 1) == 0) {
            result.get(depth).add(root.val);
        } else {
            ((LinkedList<Integer>) result.get(depth)).addFirst(root.val);
        }
        solve(result, root.left, depth + 1);
        solve(result, root.right, depth + 1);
        return result;
    }
}
