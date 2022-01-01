package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.FREQUENCY_COUNT)
@BeatsPercent(90.37)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.LINEAR_N)
public class Problem811 {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> counts = new HashMap<>();
        for (String s : cpdomains) {
            int domainIndex = s.indexOf(" ");
            int count = Integer.parseInt(s.substring(0, domainIndex));
            counts.compute(s.substring(domainIndex + 1), (__, v) -> (v == null ? 0 : v) + count);
            for (int i = domainIndex + 1; i < s.length(); ++i) {
                if (s.charAt(i) == '.') {
                    counts.compute(s.substring(i + 1), (__, v) -> (v == null ? 0 : v) + count);
                }
            }
        }
        List<String> result = new ArrayList<>(counts.size());
        counts.forEach((domain, count) -> result.add("" + count + " " + domain));
        return result;
    }
}
