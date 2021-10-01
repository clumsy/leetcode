package leetcode;

@BeatsPercent(49.58)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem299 {
    public String getHint(String secret, String guess) {
        int bulls = 0;
        int cows = 0;
        int[] count = new int[10];
        int n = secret.length();
        for (int i = 0; i < n; i++) {
            int s = secret.charAt(i) - '0';
            int g = guess.charAt(i) - '0';
            if (s == g) {
                bulls++;
            } else {
                if (count[s]-- > 0) {
                    cows++;
                }
                if (count[g]++ < 0) {
                    cows++;
                }
            }
        }
        return String.format("%dA%dB", bulls, cows);
    }
}
