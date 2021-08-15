package leetcode;

import java.util.LinkedList;
import java.util.Queue;

@Algorithms(Algorithm.BREADTH_FIRST_SEARCH)
@BeatsPercent(51.42)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.LINEAR_N)
public class Problem1302 {
    public int deepestLeavesSum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int ans = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            ans = 0;
            while (size-- > 0) {
                TreeNode node = queue.remove();
                ans += node.val;
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }
        return ans;
    }
}
