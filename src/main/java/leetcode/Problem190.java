package leetcode;

@Difficulty(Level.EASY)
@Algorithms(Algorithm.BIT_MANIPULATION)
@BeatsPercent(100)
@TimeComplexity(worst = Complexity.LINEAR_N) // where N is the number of 1 bits
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem190 {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int answer = 0;
        int mask = 1 << 31;
        while (n != 0) {
            if ((n & 1) == 1) {
                answer |= mask;
            }
            mask >>>= 1;
            n >>>= 1;
        }
        return answer;
    }
}
