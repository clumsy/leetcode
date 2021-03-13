package leetcode;

@BeatsPercent(100)
@TimeComplexity(Complexity.LINEAR_N)
@SpaceComplexity(Complexity.CONSTANT)
public class Problem303 {
    class NumArray {
        private final int[] sums;

        public NumArray(int[] nums) {
            this.sums = nums;
            for (int i = 1; i < nums.length; i++) {
                sums[i] = sums[i] + sums[i - 1];
            }
        }

        public int sumRange(int i, int j) {
            int sumI = i == 0 ? 0 : sums[i - 1];
            return sums[j] - sumI;
        }
    }
}
