package leetcode;

@BeatsPercent(99.17)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem209 {
    public int minSubArrayLen(int target, int[] nums) {
        int answer = Integer.MAX_VALUE;
        int n = nums.length;
        int sum = 0;
        int start = 0;
        for (int i = 0; i < n; i++) {
            if (sum < target) {
                sum += nums[i];
            }
            while (sum >= target) {
                answer = Math.min(answer, i + 1 - start);
                sum -= nums[start++];
            }
        }
        return answer == Integer.MAX_VALUE ? 0 : answer;
    }
}
