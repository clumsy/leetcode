package leetcode;

public class Problem42 {
    public int trap(int[] height) {
        int length = height.length;
        if (length == 0) {
            return 0;
        }
        int[] rightMax = new int[length];
        int max = height[length - 1];
        for (int i = length - 1; i >= 0; i--) {
            max = Math.max(max, height[i]);
            rightMax[i] = max;
        }
        max = height[0];
        int trapped = 0;
        for (int i = 0; i < length; i++) {
            max = Math.max(max, height[i]);
            trapped += Math.min(max, rightMax[i]) - height[i];
        }
        return trapped;
    }
}
