package leetcode;

import java.util.ArrayList;
import java.util.List;

@BeatsPercent(100)
@Algorithms(Algorithm.DEPTH_FIRST_SEARCH)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem199 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> answer = new ArrayList<>();
        dfs(root, 0, answer);
        return answer;
    }

    private void dfs(TreeNode root, int depth, List<Integer> answer) {
        if (root == null) {
            return;
        }
        if (answer.size() == depth) {
            answer.add(root.val);
        }
        dfs(root.right, depth + 1, answer);
        dfs(root.left,  depth + 1, answer);
    }
}
