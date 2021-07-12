package leetcode;

@BeatsPercent(100)
@TimeComplexity(Complexity.LINEAR_N)
@SpaceComplexity(Complexity.CONSTANT)
public class Problem1247 {
    public int minimumSwap(String s1, String s2) {
        int x_wrong = 0;
        int y_wrong = 0;
        int n = s1.length();
        for (int i = 0; i < n; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (s1.charAt(i) == 'x') {
                    x_wrong++;
                } else {
                    y_wrong++;
                }
            }
        }

        int sum = x_wrong + y_wrong;
        if (sum % 2 == 1) {
            return -1; // no way to make swaps
        }

        int swaps = sum/2;
        if (x_wrong % 2 == 1) {
            return swaps + 1;
        }
        return swaps;
    }
}
