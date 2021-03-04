package leetcode;

@BeatsPercent(93.81)
public class Problem152 {
    public int maxProduct(int[] nums) {
        int N = nums.length;
        int first = nums[0];
        int currentMin = first;
        int currentMax = first;
        int max = first;
        for (int i = 1; i < N; i++) {
            int num = nums[i];
            int min = num*currentMin;
            currentMin = Math.min(num, Math.min(min, num*currentMax));
            currentMax = Math.max(num, Math.max(min, num*currentMax));
            max = Math.max(max, currentMax);
        }
        return max;
    }
}
