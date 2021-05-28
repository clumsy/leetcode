package leetcode;

@BeatsPercent(32.36)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem189 {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        int count = 0;
        for (int start = 0; count < n; start++) {
            int i = start;
            int prev = nums[start];
            do {
                int next = (i + k) % n;
                int current = nums[next];
                nums[next] = prev;
                prev = current;
                i = next;
                count++;
            } while (i != start);
        }
    }
}
