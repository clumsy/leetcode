package leetcode;

@BeatsPercent(28.50)
@TimeComplexity(worst = Complexity.LINEAR_N) // where N is max(nums.length, queries.length)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem985 {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int sum = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        int n = queries.length;
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            int val   = queries[i][0];
            int index = queries[i][1];
            if (nums[index] % 2 == 0) {
                sum -= nums[index];
            }
            nums[index] += val;
            if (nums[index] % 2 == 0) {
                sum += nums[index];
            }
            answer[i] = sum;
        }
        return answer;
    }
}
