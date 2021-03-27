package leetcode;

import java.util.*;

@BeatsPercent(55.73)
@TimeComplexity(Complexity.LINEAR_N)
@SpaceComplexity(Complexity.LINEAR_N)
public class Problem398 {
    public class Solution {
        private final Random random = new Random();
        private final Map<Integer, List<Integer>> numToIndices = new HashMap<>();

        public Solution(int[] nums) {
            for (int i = 0; i < nums.length; i++) {
                List<Integer> indices = numToIndices.get(nums[i]);
                if (indices == null) {
                    indices = new ArrayList<>();
                    numToIndices.put(nums[i], indices);
                }
                indices.add(i);
            }
        }

        public int pick(int target) {
            List<Integer> indices = numToIndices.get(target);
            int nextIndex = random.nextInt(indices.size());
            return indices.get(nextIndex);
        }
    }
}
