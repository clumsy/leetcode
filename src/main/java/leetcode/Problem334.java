package leetcode;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.ELIMINATION)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem334 {
    public boolean increasingTriplet(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MAX_VALUE;
        for (int n : nums) {
            if (n <= min) {
                min = n;
            } else if (n <= max) { // update small if n is smaller than both
                max = n;
            } else { // update big only if greater than small but smaller than big
                return true; // return if you find a number bigger than both
            }
        }
        return false;
    }
}
