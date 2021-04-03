package leetcode;

@BeatsPercent(100)
@TimeComplexity(Complexity.LOGARITHMIC_N)
@SpaceComplexity(Complexity.CONSTANT)
public class Problem540 {
    public int singleNonDuplicate(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int middle = left + (right - left)/2;
            int num = nums[middle];
            boolean sameLeft  = middle > 0               && num == nums[middle - 1];
            boolean sameRight = middle < nums.length - 1 && num == nums[middle + 1];
            if (!sameLeft && !sameRight) {
                return num;
            }
            if (sameLeft) {
                if ((middle + 1) % 2 == 0) {
                    left = middle + 1;
                } else {
                    right = middle - 1;
                }
            } else {
                if ((middle + 1) % 2 == 0) {
                    right = middle - 1;
                } else {
                    left = middle + 1;
                }
            }
        }
        return nums[left];
    }
}
