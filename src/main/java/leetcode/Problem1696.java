package leetcode;

import java.util.*;

@BeatsPercent(69.20)
@TimeComplexity(Complexity.LINEAR_N)
@SpaceComplexity(Complexity.LINEAR_K)
public class Problem1696 {
    public int maxResult(int[] nums, int k) {
        int n = nums.length;
        Deque<Integer> maxQueue = new ArrayDeque<>();
        maxQueue.offer(nums[n - 1]);
        for (int i = n - 2; i >= 0; i--) {
            int sum = nums[i] + maxQueue.peekFirst(); // first is MAX
            maxQueue.addLast(sum);
            if (maxQueue.size() > k) {
                maxQueue.removeFirst();
            }
            while (!maxQueue.isEmpty() && sum > maxQueue.peekFirst()) {
                maxQueue.removeFirst();
            }
        }
        return maxQueue.peekLast();
    }
}
