package leetcode;

@Beats100Percent
public class Problem96 {
    public int numTrees(int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 3) {
            return n;
        }
        int[] nums = new int[n + 1];
        nums[0] = 1;
        nums[1] = 1;
        nums[2] = 2;
        int k = 2;
        while (++k <= n) {
            for (int i = 0; i < k; i++) {
                nums[k] += nums[i] * nums[k - 1 - i];
            }
        }
        return nums[n];
    }
}
