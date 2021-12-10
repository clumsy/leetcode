package leetcode;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.ELIMINATION)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem334 {
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for (int n : nums) {
            if (n <= first) {
                first = n; // update small if n is smaller than both
            } else if (n <= second) {
                second = n; // update big only if greater than small but smaller than big
            } else {
                return true; // return if you find a number bigger than both, no matter when they were set
            }
        }
        return false;
    }
}
