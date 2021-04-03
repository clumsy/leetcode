package leetcode;

@BeatsPercent(98.70)
@TimeComplexity(Complexity.SQRT_N)
@SpaceComplexity(Complexity.CONSTANT)
public class Problem1362 {
    public int[] closestDivisors(int num) {
        for (int i = (int) Math.sqrt(num + 2); i >= 1; i--) {
            if ((num + 1) % i == 0) {
                return new int[] {i, (num + 1)/i};
            }
            if ((num + 2) % i == 0) {
                return new int[] {i, (num + 2)/i};
            }
        }
        throw new RuntimeException("Should not happen!");
    }
}
