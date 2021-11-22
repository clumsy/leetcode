package leetcode;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.DUTCH_FLAG_SORTING)
@BeatsPercent(100)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem75 {
    public void sortColors(int[] nums) {
        for (int n = nums.length, red = 0, white = 0, blue = n - 1; white <= blue;) {
            if (nums[white] == 0) {
                nums[white++] = nums[red];
                nums[red++] = 0;
            } else if (nums[white] == 1) {
                white++;
            } else if (nums[white] == 2) {
                nums[white] = nums[blue];
                nums[blue--] = 2;
            }
        }
    }
}
