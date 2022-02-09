package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.BIDIRECTIONAL_BREADTH_FIRST_SEARCH)
@BeatsPercent(100)
@TimeComplexity(worst = Complexity.LINEAR_N) // where N = bank.length
@SpaceComplexity(worst = Complexity.LINEAR_N)
public class Problem433 {
    public int minMutation(String start, String end, String[] bank) {
        if (start.equals(end)) {
            return 0;
        }
        Set<String> set = new HashSet<>(Arrays.asList(bank));
        if (!set.contains(end)) {
            return -1;
        }
        Set<String> from = new HashSet<>();
        from.add(start);
        Set<String> seen_from = new HashSet<>();
        seen_from.add(start);
        Set<String> to = new HashSet<>();
        to.add(end);
        Set<String> seen_to = new HashSet<>();
        seen_to.add(end);
        int mutations = 1;
        while (!from.isEmpty() && !to.isEmpty()) {
            if (from.size() > to.size()) {
                Set<String> tmp = from;
                from = to;
                to = tmp;
                tmp = seen_from;
                seen_from = seen_to;
                seen_to = tmp;
            }
            Set<String> new_from = new HashSet<>();
            for (String gene : from) {
                for (String mutation : set) {
                    if (diff(gene, mutation) == 1) {
                        if (seen_to.contains(mutation) || to.contains(mutation)) {
                            return mutations;
                        }
                        new_from.add(mutation);
                        seen_from.add(mutation);
                    }
                }
            }
            from = new_from;
            mutations++;
        }
        return -1;
    }

    private int diff(String a, String b) {
        int diff = 0;
        for (int i = 0; i < a.length(); ++i) {
            diff += a.charAt(i) == b.charAt(i) ? 0 : 1;
        }
        return diff;
    }
}
