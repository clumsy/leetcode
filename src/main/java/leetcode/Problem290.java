package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Difficulty(Level.EASY)
@BeatsPercent(100)
@Algorithms(Algorithm.INDEXING)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.LINEAR_N)
public class Problem290 {
    public boolean wordPattern(String pattern, String s) {
        String[] w = s.split(" ");
        if (pattern.length() != w.length) {
            return false;
        }
        char[] p = pattern.toCharArray();
        Map<Object, Integer> map = new HashMap<>();
        for (int i = 0; i < w.length; i++) {
            if (!Objects.equals(map.put(p[i], i), map.put(w[i], i))) {
                return false;
            }
        }
        return true;
    }
}
