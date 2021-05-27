package leetcode;

@BeatsPercent(100)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem238 {
    public int[] productExceptSelf(int[] nums) {
        int zeroes = 0;
        int product = 1;
        for (int num : nums) {
            if (num == 0) {
                if (++zeroes > 1) {
                    break;
                }
            } else {
                product *= num;
            }
        }
        int n = nums.length;
        if (zeroes > 1) {
            for (int i = 0; i < n; i++) {
                nums[i] = 0;
            }
        } else {
            for (int i = 0; i < n; i++) {
                if (nums[i] == 0) {
                    nums[i] = product;
                } else {
                    nums[i] = zeroes > 0 ? 0 : product/nums[i];
                }
            }
        }
        return nums;
    }
}
