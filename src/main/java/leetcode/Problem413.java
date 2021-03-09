package leetcode;

@BeatsPercent(100)
@TimeComplexity(Complexity.LINEAR_N)
@SpaceComplexity(Complexity.CONSTANT)
public class Problem413 {
    public int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length;
        if (n < 3) {
            return 0;
        }
        int count = 0;
        for (int i = 0, j = 1, diff = nums[1] - nums[0]; j < n; j++) {
            int newDiff = j == n - 1 ? 0 : nums[j + 1] - nums[j];
            if (j == n - 1 || newDiff != diff) {
                while (j - i > 1) {
                    count += j - i - 1;
                    i++;
                }
                i = j;
            }
            diff = newDiff;
        }
        return count;
    }
}
