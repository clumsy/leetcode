package leetcode;

import java.util.HashMap;
import java.util.Map;

@Difficulty(Level.HARD)
@Algorithms(Algorithm.BASIC_GEOMETRY)
@BeatsPercent(50.12)
@TimeComplexity(worst = Complexity.QUADRATIC_N)
@SpaceComplexity(worst = Complexity.LINEAR_N)
public class Problem149 {
    public int maxPoints(int[][] points) {
        int n = points.length;
        if (n < 3) {
            return n;
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            Map<String, Integer> counter = new HashMap<>();
            for (int j = i + 1; j < n; j++) {
                int dx = points[j][0] - points[i][0];
                int dy = points[j][1] - points[i][1];
                int gcd = gcd(dx, dy); // using GCD we will use irreducible fractions for slopes
                String key = "" + (dx / gcd) + "_" + (dy / gcd);
                int current = counter.compute(key, (k, v) -> v == null ? 2 : v + 1);
                ans = Math.max(ans, current);
            }
        }
        return ans;
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
