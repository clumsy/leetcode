package leetcode;

@Difficulty(Level.EASY)
@Algorithms(Algorithm.BIT_MANIPULATION)
@BeatsPercent(100)
@TimeComplexity(worst = Complexity.CONSTANT)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem1342 {
    public int numberOfSteps(int num) {
        if (num == 0) {
            return 0;
        }
        int bit_length = log2(num) + 1;
        return bit_length + Integer.bitCount(num) - 1; // don't need to move last bit
    }

    private static int log2(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException();
        }
        return 31 - Integer.numberOfLeadingZeros(n);
    }
}
