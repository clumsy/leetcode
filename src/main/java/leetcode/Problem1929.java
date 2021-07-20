package leetcode;

@BeatsPercent(100)
@TimeComplexity(Complexity.LINEAR_N)
@SpaceComplexity(Complexity.CONSTANT)
public class Problem1929 {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2*n];
        for (int i = 0; i < n; i++) {
            ans[i] = ans[i + n] = nums[i];
        }
        return ans;
    }
}
