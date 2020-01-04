package leetcode;

public class Problem11 {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int max = 0;
        while (left != right) {
            int leftHeight = height[left];
            int rightHeight = height[right];
            int currentHeight = Math.min(leftHeight, rightHeight);
            int current = currentHeight*(right - left);
            if (current > max) {
                max = current;
            }
            if (leftHeight < rightHeight) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
}
