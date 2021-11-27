package leetcode;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.BIT_MANIPULATION)
@BeatsPercent(100)
@TimeComplexity(worst = Complexity.CONSTANT)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem201 {
    public int rangeBitwiseAnd(int m, int n) {
        if (m == n) {
            return m;
        }
        int difference = n - m; // how many numbers in between
        int most_significant_bit = 1 << log2(difference); // most significant bit to be flipped, i flips every 2^i 
        int bits_to_remove = (most_significant_bit << 1) - 1;
        return m & n & ~bits_to_remove;
    }

    private static int log2(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException();
        }
        return 31 - Integer.numberOfLeadingZeros(n);
    }
}
