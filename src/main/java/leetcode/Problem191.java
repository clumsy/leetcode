package leetcode;

@Difficulty(Level.EASY)
@Algorithms(Algorithm.BIT_MANIPULATION)
@BeatsPercent(100)
@TimeComplexity(worst = Complexity.CONSTANT)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem191 {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            n -= n & -n;
            count++;
        }
        return count;
    }
}
