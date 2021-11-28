package leetcode;

import java.util.Arrays;
import java.util.Random;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.FISHER_YATES_SHUFFLE)
@BeatsPercent(98.09)
public class Problem384 {
    class Solution {
        private final int[] nums;
        private final int[] current;
        private final Random random = new Random();

        @TimeComplexity(worst = Complexity.LINEAR_N)
        @SpaceComplexity(worst = Complexity.LINEAR_N)
        public Solution(int[] nums) {
            this.nums = nums;
            this.current = Arrays.copyOf(nums, nums.length);
        }

        @TimeComplexity(worst = Complexity.CONSTANT)
        @SpaceComplexity(worst = Complexity.CONSTANT)
        public int[] reset() {
            return this.nums;
        }

        @TimeComplexity(worst = Complexity.CONSTANT)
        @SpaceComplexity(worst = Complexity.CONSTANT)
        public int[] shuffle() {
            int i = random.nextInt(nums.length);
            int j = random.nextInt(nums.length);
            int tmp = current[i];
            current[i] = current[j];
            current[j] = tmp;
            return current;
        }
    }
}
