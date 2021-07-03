package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@BeatsPercent(69.26)
@TimeComplexity(Complexity.N_PLUS_K)
@SpaceComplexity(Complexity.LINEAR_N)
public class Problem819 {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.toLowerCase();
        Set<String> ignored = new HashSet<>();
        for (String word : banned) {
            ignored.add(word.toLowerCase());
        }
        int max = 0;
        String result = null;
        Map<String, Integer> map = new HashMap<>();
        for (String word : paragraph.split("[\\s!?',;.]+")) {
            if (ignored.contains(word)) {
                continue;
            }
            int count = map.getOrDefault(word, 0);
            if (++count > max) {
                max = count;
                result = word;
            }
            map.put(word, count);
        }
        return result;
    }
}
