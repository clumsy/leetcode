package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.SORTING)
@BeatsPercent(93.88)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.LINEAR_N)
public class Problem1817 {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        Map<Integer, Set<Integer>> count = new HashMap<>();
        for (int[] log : logs) {
            count.compute(log[0], (__, v) -> v == null ? new HashSet<>() : v).add(log[1]);
        }
        int[] answer = new int[k];
        count.forEach((id, mins) -> {
            ++answer[mins.size() - 1];
        });
        return answer;
    }
}
