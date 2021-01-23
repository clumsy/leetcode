package leetcode;

public class Problem45 {
    public int jump(int[] nums) {
        int n = nums.length;
        if (n <= 1) {
            return 0;
        }
        int currentReach = nums[0];
        int maxReach = currentReach;
        int jumps = 1;
        for (int i = 1; i < nums.length; i++) {
            if (currentReach >= n - 1) {
                return jumps;
            }
            int potentialReach = i + nums[i];
            maxReach = Math.max(maxReach, potentialReach);
            if (i == currentReach) {
                currentReach = maxReach;
                jumps++;
            }
        }
        throw new RuntimeException("This should not happen");
    }
}
