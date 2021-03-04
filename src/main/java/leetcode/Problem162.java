package leetcode;

@BeatsPercent(100)
public class Problem162 {
    public int findPeakElement(int[] nums) {
        int N = nums.length;
        int left = 0;
        int right = N - 1;
        while (left < right) {
            int middle = left + (right - left)/2;
            if (nums[middle] < nums[middle + 1]) {
                left = middle + 1;
            } else {
                right = middle;
            }
        }
        return left;
    }
}
