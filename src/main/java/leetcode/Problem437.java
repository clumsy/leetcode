package leetcode;

import java.util.ArrayList;
import java.util.List;

@BeatsPercent(50.77)
@TimeComplexity(Complexity.QUADRATIC_N) // ???
@SpaceComplexity(Complexity.LINEAR_N)
public class Problem437 {
    public int pathSum(TreeNode root, int sum) {
        return doPathSum(root, sum, new ArrayList<>());
    }

    private int doPathSum(TreeNode root, int sum, List<Integer> path) {
        if (root == null) {
            return 0;
        }
        path.add(root.val);
        int count = 0;
        count += doPathSum(root.left, sum, path);
        count += doPathSum(root.right, sum, path);
        int currentSum = 0;
        for (int i = path.size() - 1; i >= 0; i--) {
            currentSum += path.get(i);
            if (currentSum == sum) {
                count++;
            }
        }
        path.remove(path.size() - 1);
        return count;
    }
}
