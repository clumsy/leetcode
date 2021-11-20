package leetcode;

@Difficulty(Level.EASY)
@Algorithms(Algorithm.RECURSION)
@BeatsPercent(97.79)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem653 {
    public boolean findTarget(TreeNode root, int k) {
        return findTarget(root, k, new int[10000 + 1 + 10000]);
    }

    private boolean findTarget(TreeNode root, int k, int[] count) {
        if (root == null) {
            return false;
        }
        int diff = k - root.val;
        if (diff >= -10000 && diff <= 10000 && count[diff + 10000] > 0) {
            return true;
        }
        count[root.val + 10000]++;
        return findTarget(root.left, k, count) || findTarget(root.right, k, count);
    }
}
