package leetcode;

@Difficulty(Level.EASY)
@Algorithms(Algorithm.TWO_POINTERS)
@BeatsPercent(99.81)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem557 {
    public String reverseWords(String s) {
        char[] ss = s.toCharArray();
        int n = ss.length;
        int lo = 0;
        while (lo < n) {
            while (ss[lo] == ' ') {
                lo++;
            }
            if (lo == n) {
                break;
            }
            int end = lo;
            while (end < n && ss[end] != ' ') {
                end++;
            }
            int hi = end - 1;
            while (lo < hi) {
                char tmp = ss[lo];
                ss[lo] = ss[hi];
                ss[hi] = tmp;
                lo++;
                hi--;
            }
            lo = end;
        }
        return new String(ss);
    }
}
