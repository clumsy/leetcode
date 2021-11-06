package leetcode;

@Difficulty(Level.EASY)
@Algorithms(Algorithm.BIT_MANIPULATION)
@BeatsPercent(100)
@TimeComplexity(worst = Complexity.CONSTANT)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem231 {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        return n - (n & -n) == 0; // checking if flipping right-most bit makes it 0
    }
}
