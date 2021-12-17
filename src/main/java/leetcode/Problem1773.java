package leetcode;

import java.util.List;

@Difficulty(Level.EASY)
@Algorithms(Algorithm.SIMULATION)
@BeatsPercent(51.81)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem1773 {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int position = "type".equals(ruleKey) ? 0 : "color".equals(ruleKey) ? 1 : 2;
        int count = 0;
        for (List<String> item : items) {
            count += item.get(position).equals(ruleValue) ? 1 : 0;
        }
        return count;
    }
}
