package leetcode;

public class Problem268 {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n*(n + 1)/2;
        while (--n >= 0) {
            sum -= nums[n];
        }
        return sum;
    }
}
