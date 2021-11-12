package leetcode;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.TWO_POINTERS)
@BeatsPercent(86.65)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem11 {
    public int maxArea(int[] height) {
        int max = 0;
        int lo = 0;
        int hi = height.length - 1;
        while (lo < hi) {
            max = Math.max(max, (hi - lo)*Math.min(height[lo], height[hi]));
            if (height[lo] < height[hi]) {
                lo++;
            } else {
                hi--;
            }
        }
        return max;
    }
}
