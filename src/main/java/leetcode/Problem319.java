package leetcode;

@Algorithms(Algorithm.MATH)
@BeatsPercent(100)
@TimeComplexity(worst = Complexity.CONSTANT)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem319 {
    public int bulbSwitch(int n) {
        // squares have odd number of divisors, counting all squares up to n
        return (int) Math.sqrt(n);
    }
}
