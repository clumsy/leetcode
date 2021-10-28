package leetcode;

@Difficulty(Level.EASY)
@Algorithms(Algorithm.TWO_POINTERS)
@BeatsPercent(96.49)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem344 {
    public void reverseString(char[] s) {
        int lo = 0;
        int hi = s.length - 1;
        while (lo < hi) {
            char tmp = s[lo];
            s[lo] = s[hi];
            s[hi] = tmp;
            lo++;
            hi--;
        }
    }
}
