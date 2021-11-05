package leetcode;

@Difficulty(Level.EASY)
@Algorithms(Algorithm.DYNAMIC_PROGRAMMING)
@BeatsPercent(100)
@TimeComplexity(worst = Complexity.CONSTANT)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem70 {
    public int climbStairs(int n) {
        double phi = Math.sqrt(5);
        double result = (Math.pow((1 + phi)/2, n + 1) - Math.pow((1 - phi)/2, n + 1))/phi;
        return (int) result;
    }
}
