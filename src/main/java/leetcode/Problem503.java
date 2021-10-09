package leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.MONOTONIC_QUEUE)
@BeatsPercent(97.37)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.LINEAR_N)
public class Problem503 {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] greater = new int[n];
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && nums[stack.peek()] <= nums[i]) {
                stack.pop();
            }
            stack.push(i);
        }
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && nums[stack.peek()] <= nums[i]) {
                stack.pop();
            }
            greater[i] = stack.isEmpty() ? -1 : nums[stack.peek()];
            stack.push(i);
        }
        return greater;
    }
}
