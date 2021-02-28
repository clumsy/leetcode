package leetcode;

@Beats100Percent
public class Problem977 {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int n = nums.length;
        int right = n - 1;
        int[] result = new int[n];
        while (left <= right) {
            int leftSquare = nums[left]*nums[left];
            int rightSquare = nums[right]*nums[right];
            if (rightSquare >= leftSquare) {
                result[--n] = rightSquare;
                right--;
            } else {
                result[--n] = leftSquare;
                left++;
            }
        }
        return result;
    }
}
