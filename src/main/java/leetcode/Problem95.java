package leetcode;

import java.util.ArrayList;
import java.util.List;

@Beats100Percent
public class Problem95 {
    public List<TreeNode> generateTrees(int n) {
        boolean[] visited = new boolean[n + 1];
        return generateTrees(visited, 1, n);
    }

    private List<TreeNode> generateTrees(boolean[] visited, int min, int max) {
        List<TreeNode> result = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            if (visited[i]) {
                continue;
            }
            visited[i] = true;
            List<TreeNode> lefts = generateTrees(visited, min, i);
            List<TreeNode> rights = generateTrees(visited, i, max);
            for (TreeNode left : lefts) {
                for (TreeNode right : rights) {
                    TreeNode root = new TreeNode(i);
                    root.left = left;
                    root.right = right;
                    result.add(root);
                }
            }
            visited[i] = false;
        }
        if (result.isEmpty()) {
            result.add(null);
        }
        return result;
    }
}
