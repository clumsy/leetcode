package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.GREEDY)
@BeatsPercent(92.05)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.LINEAR_N)
public class Problem1282 {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, List<Integer>> sizes = new HashMap<>();
        for (int i = 0; i < groupSizes.length; ++i) {
            List<Integer> group = sizes.compute(groupSizes[i], (__, v) -> v == null ? new ArrayList<>() : v);
            group.add(i);
            if (group.size() == groupSizes[i]) {
                result.add(new ArrayList<>(group));
                group.clear();
            }
        }
        return result;
    }
}
