package leetcode;

@BeatsPercent(100)
@TimeComplexity(Complexity.LOGARITHMIC_N)
@SpaceComplexity(Complexity.CONSTANT)
public class Problem374 {
    public int guessNumber(int n) {
        int lo = 1;
        int hi = Integer.MAX_VALUE;
        while (lo <= hi) {
            int mid = lo + (hi - lo)/2;
            int guess = guess(mid);
            if (guess == 0) {
                return mid;
            }
            if (guess > 0) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        throw new RuntimeException();
    }
    
    protected int guess(int i) {
        throw new UnsupportedOperationException();
    }
}
