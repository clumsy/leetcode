package leetcode;

import java.util.ArrayList;
import java.util.List;

@BeatsPercent(100)
@Algorithms(Algorithm.LEVEL_ORDER_TRAVERSAL)
@TimeComplexity(Complexity.LINEAR_N)
@SpaceComplexity(Complexity.CONSTANT)
public class Problem102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> levels = new ArrayList<>();
        collect(levels, root, 0);
        return levels;
    }

    private void collect(List<List<Integer>> levels, TreeNode root, int depth) {
        if (root == null) {
            return;
        }
        if (levels.size() < depth + 1) {
            levels.add(new ArrayList<>());
        }
        levels.get(depth).add(root.val);
        collect(levels, root.left,  depth + 1);
        collect(levels, root.right, depth + 1);
    }
}
