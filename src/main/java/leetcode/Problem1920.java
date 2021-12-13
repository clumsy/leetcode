package leetcode;

@Difficulty(Level.EASY)
@Algorithms(Algorithm.EUCLIDEAN_DIVISION)
@BeatsPercent(99.96)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem1920 {
    public int[] buildArray(int[] nums) {
        int q = nums.length;
        // making nums[i] = q*b + r, where r < q, b = nums[nums[i]], r = nums[i]
        for (int i = 0; i < q; i++) {
            nums[i] += q * (nums[nums[i]] % q); // b could already have been processed
        }
        for (int i = 0; i < q; i++) {
            nums[i] /= q;
        }
        return nums;
    }
}
