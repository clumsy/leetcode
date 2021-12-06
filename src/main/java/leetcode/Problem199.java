package leetcode;

import java.util.ArrayList;
import java.util.List;

@Difficulty(Level.MEDIUM)
@BeatsPercent(100)
@Algorithms(Algorithm.DEPTH_FIRST_SEARCH)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem199 {
    public List<Integer> rightSideView(TreeNode root) {
        return dfs(root, 0, new ArrayList<>());
    }

    private List<Integer> dfs(TreeNode root, int depth, List<Integer> answer) {
        if (root == null) {
            return answer;
        }
        if (answer.size() == depth) {
            answer.add(root.val);
        }
        dfs(root.right, depth + 1, answer);
        dfs(root.left,  depth + 1, answer);
        return answer;
    }
}
