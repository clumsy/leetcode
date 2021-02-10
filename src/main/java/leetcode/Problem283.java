package leetcode;

public class Problem283 {
    public void moveZeroes(int[] nums) {
        for (int lastNonZero = 0, i = 0, length = nums.length; i < length; i++) {
            int num = nums[i];
            if (num != 0) {
                if (i != lastNonZero) {
                    int tmp = nums[lastNonZero];
                    nums[lastNonZero] = num;
                    nums[i] = tmp;
                }
                lastNonZero++;
            }
        }
    }
}
