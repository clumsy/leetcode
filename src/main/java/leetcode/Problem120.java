package leetcode;

import java.util.List;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.DYNAMIC_PROGRAMMING)
@BeatsPercent(47.86)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        for (int n = triangle.size(), row = n - 2; row >= 0; row--) {
            for (int i = 0, k = triangle.get(row).size(); i < k; i++) {
                triangle.get(row).set(i, triangle.get(row).get(i) + Math.min(triangle.get(row + 1).get(i), triangle.get(row + 1).get(i + 1)));
            }
        }
        return triangle.get(0).get(0);
    }
}
