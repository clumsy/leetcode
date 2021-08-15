package leetcode;

@Algorithms(Algorithm.SLIDING_WINDOW)
@BeatsPercent(100)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem1876 {
    public int countGoodSubstrings(String s) {
        int[] counts = new int[26];
        int ans = 0;
        char[] a = s.toCharArray();
        int repeats = 0;
        for (int i = 0; i < a.length; i++) {
            if (i > 2 && --counts[a[i - 3] - 'a'] == 1) {
                repeats--;
            }
            if (++counts[a[i] - 'a'] == 2) {
                repeats++;
            }
            if (i >= 2 && repeats == 0) {
                ans++;
            }
        }
        return ans;
    }
}
