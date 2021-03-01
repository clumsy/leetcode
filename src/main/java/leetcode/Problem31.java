package leetcode;

public class Problem31 {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int peak = 0;
        // find the peak from the right
        for (int i = n - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                peak = i;
                break;
            }
        }
        if (peak > 0) {
            // swap smallest value > nums[peak - 1] from the right in [peak; n)
            int target = nums[peak - 1];
            for (int i = n - 1; i >= peak; i--) {
                if (nums[i] > target) {
                    nums[peak - 1] = nums[i];
                    nums[i] = target;
                    break;
                }
            }
        }
        // reverse the sorted list [peak;n)
        for (int i = peak, j = n - 1; i < j; i++, j--) {
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
    }
}
