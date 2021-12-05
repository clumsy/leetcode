package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.FREQUENCY_COUNT)
@BeatsPercent(99.59)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.LINEAR_N)
public class Problem49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<>(strs.length, 1f);
        for (String str : strs) {
            char[] counts = new char[26];
            for (char c : str.toCharArray()) {
                counts[c - 'a']++;
            }
            anagrams.compute(String.valueOf(counts), (k, v) -> v == null ? new ArrayList<>() : v).add(str);
        }
        return new ArrayList<>(anagrams.values());
    }
}
