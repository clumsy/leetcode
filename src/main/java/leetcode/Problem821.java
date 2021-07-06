package leetcode;

@BeatsPercent(97.66)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem821 {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] result = new int[n];
        for (int i = 0, j = 0; i < n; i++) {
            char letter = s.charAt(i);
            if (letter == c) {
                j = i + 1;
                result[i] = 0;
                continue;
            }
            while (j < n && s.charAt(j) != c) {
                j++;
            }
            result[i] = Math.min(i > 0 ? result[i - 1] + 1 : Integer.MAX_VALUE, j < n ? j - i : Integer.MAX_VALUE);
        }
        return result;
    }
}
