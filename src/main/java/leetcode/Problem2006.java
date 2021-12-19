package leetcode;

public class Problem2006 {
    private static final int MAX = 100;

    public int countKDifference(int[] nums, int k) {
        int[] count = new int[MAX + 1];
        int answer = 0;
        for (int num : nums) {
            answer += num + k <= MAX ? count[num + k] : 0;
            answer += num - k >= 0 ? count[num - k] : 0;
            ++count[num];
        }
        return answer;
    }
}
