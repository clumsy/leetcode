package leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

@BeatsPercent(51.48)
@TimeComplexity(Complexity.LINEAR_N)
@SpaceComplexity(Complexity.LINEAR_K)
public class Problem239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> queue = new ArrayDeque<>();
        int n = nums.length;
        int[] result = new int[n - k + 1];
        for (int i = 0; i < n; i++) {
            if (!queue.isEmpty() && queue.peekFirst() == i - k) {
                queue.removeFirst();
            }
            int next = nums[i];
            while (!queue.isEmpty() && next > nums[queue.peekLast()]) {
                queue.removeLast();
            }
            queue.addLast(i);
            int index = i - k + 1;
            if (index >= 0) {
                result[index] = nums[queue.peekFirst()];
            }
        }
        return result;
    }
}
