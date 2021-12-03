package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Difficulty(Level.MEDIUM)
@BeatsPercent(96.62)
@Algorithms(Algorithm.SLIDING_WINDOW)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.LINEAR_N)
public class Problem187 {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> at_least_once = new HashSet<>();
        Set<String> at_least_twice = new HashSet<>();
        for (int i = 0, max = s.length() - 10; i <= max; i++) {
            String substring = s.substring(i, i + 10);
            if (!at_least_once.add(substring)) {
                at_least_twice.add(substring);
            }
        }
        return new ArrayList<>(at_least_twice);
    }
}
