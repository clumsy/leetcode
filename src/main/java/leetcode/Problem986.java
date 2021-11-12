package leetcode;

import java.util.ArrayList;
import java.util.List;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.MERGE_INTERVAL)
@BeatsPercent(99.70)
@TimeComplexity(worst = Complexity.N_PLUS_M)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem986 {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]> result = new ArrayList<>();
        for (int i = 0, j = 0; i < firstList.length && j < secondList.length;) {
            int start = Math.max(firstList[i][0], secondList[j][0]);
            int end = Math.min(firstList[i][1], secondList[j][1]);
            if (end - start >= 0) {
                result.add(new int[] {start, end});
            }
            if (firstList[i][1] < secondList[j][1]) {
                i++;
            } else {
                j++;
            }
        }
        return result.toArray(new int[0][0]);
    }
}
