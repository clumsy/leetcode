package leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

@Difficulty(Level.EASY)
@Algorithms(Algorithm.MONOTONIC_QUEUE)
@BeatsPercent(98.74)
@SpaceComplexity(worst = Complexity.N_PLUS_M) // where M = nums1.length
@TimeComplexity(worst = Complexity.LINEAR_N) // where N = nums2.length
public class Problem496 {
    private static final int MAX = 10001;

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums2.length;
        int[] greater = new int[n];
        int[] index = new int[MAX];
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = n - 1; i >= 0; i--) {
            int num = nums2[i];
            index[num] = i;
            while (!stack.isEmpty() && nums2[stack.peek()] <= num) {
                stack.pop();
            }
            greater[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
        int m = nums1.length;
        int[] ans = new int[m];
        for (int i = 0; i < m; i++) {
            int found = greater[index[nums1[i]]];
            ans[i] = found < 0 ? -1 : nums2[found];
        }
        return ans;
    }
}
