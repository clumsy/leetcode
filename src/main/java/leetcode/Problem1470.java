package leetcode;

@BeatsPercent(100)
@TimeComplexity(Complexity.LINEAR_N)
@SpaceComplexity(Complexity.CONSTANT)
public class Problem1470 {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];
        for (int i = 0; i < n; i++) {
            ans[2*i]     = nums[i];
            ans[2*i + 1] = nums[i + n];
        }
        return ans;
    }
}
