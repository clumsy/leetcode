package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@BeatsPercent(100)
@Algorithms(Algorithm.INDEXING)
@TimeComplexity(Complexity.LINEAR_N)
@SpaceComplexity(Complexity.LINEAR_N)
public class Problem290 {
    public boolean wordPattern(String pattern, String s) {
        char[] p = pattern.toCharArray();
        String[] w = s.split(" ");
        if (p.length != w.length) {
            return false;
        }
        Map<Object, Integer> map = new HashMap<>();
        for (int i = 0; i < w.length; i++) {
            if (!Objects.equals(map.put(p[i], i), map.put(w[i], i))) {
                return false;
            }
        }
        return true;
    }
}
