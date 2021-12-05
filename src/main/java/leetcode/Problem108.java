package leetcode;

@Difficulty(Level.EASY)
@Algorithms(Algorithm.RECURSION)
@BeatsPercent(100)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.LOGARITHMIC_N) // the stack depth
public class Problem108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums, 0, nums.length - 1);
    }

    private TreeNode sortedArrayToBST(int[] nums, int l, int r) {
        if (l > r) {
            return null;
        }
        int m = l + (r - l)/2;
        TreeNode root = new TreeNode(nums[m]);
        root.left = sortedArrayToBST(nums, l, m - 1);
        root.right = sortedArrayToBST(nums, m + 1, r);
        return root;
    }
}
