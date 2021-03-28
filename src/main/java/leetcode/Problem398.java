package leetcode;

import java.util.*;

@BeatsPercent(60.59)
@TimeComplexity(Complexity.LINEAR_N)
@SpaceComplexity(Complexity.LINEAR_N)
public class Problem398 {
    public class Solution {
        private final Random random = new Random();
        private final int[] nums;

        public Solution(int[] nums) {
            this.nums = nums;
        }

        public int pick(int target) {
            int index = 0;
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == target) {
                    count++;
                    if (random.nextInt(count) == 0) {
                        index = i;
                    }
                }
            }
            return index;
        }
    }
}
