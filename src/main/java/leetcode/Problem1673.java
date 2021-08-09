package leetcode;

@BeatsPercent(96.98)
@TimeComplexity(Complexity.LINEAR_N)
@SpaceComplexity(Complexity.CONSTANT) // using answer as intermediate stack
public class Problem1673 {
    public int[] mostCompetitive(int[] nums, int k) {
        int n = nums.length;
        int size = 0;
        int[] stack = new int[k];
        for (int i = 0; i < n; i++) {
            while (size > 0 && nums[i] < stack[size - 1] && n - i > k - size) {
                size--;
            }
            if (size < k) {
                stack[size++] = nums[i];
            }
        }
        return stack;
    }
}
