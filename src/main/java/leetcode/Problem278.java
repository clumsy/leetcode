package leetcode;

@Difficulty(Level.EASY)
@Algorithms(Algorithm.BINARY_SEARCH)
@BeatsPercent(99)
@TimeComplexity(worst = Complexity.LOGARITHMIC_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem278 {
    private final int badVersion;
    
    Problem278(int badVersion) {
        this.badVersion = badVersion;
    }
    
    public int firstBadVersion(int n) {
        int lo = 1;
        int hi = n;
        while (lo < hi) {
            int mid = lo + (hi - lo)/2;
            if (!isBadVersion(mid)) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return lo;
    }

    private boolean isBadVersion(int version) {
        return version == this.badVersion;
    }
}
