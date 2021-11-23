package leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.SIMULATION)
@BeatsPercent(77.41)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem119 {
    public List<Integer> getRow(int rowIndex) {
        int[] level = new int[rowIndex + 1];
        level[0] = 1;
        for (int k = 1; k <= rowIndex; k++) {
            for (int i = k; i >= 1; i--) {
                level[i] += level[i - 1];
            }
        }
        return Arrays.stream(level).boxed().collect(Collectors.toList());
    }
}
