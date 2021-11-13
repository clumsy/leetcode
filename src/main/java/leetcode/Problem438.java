package leetcode;

import java.util.ArrayList;
import java.util.List;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.FREQUENCY_COUNT)
@BeatsPercent(99.50)
@TimeComplexity(worst = Complexity.N_PLUS_M) // where N is the length of the pattern
@SpaceComplexity(worst = Complexity.LINEAR_N)
public class Problem438 {
    public List<Integer> findAnagrams(String s, String p) {
        int[] count = new int[26];
        int remains = 0;
        for (char c : p.toCharArray()) {
            if (++count[c - 'a'] == 1) {
                remains++;
            }
        }
        char[] ss = s.toCharArray();
        List<Integer> result = new ArrayList<>();
        int n = p.length();
        for (int i = 0; i < ss.length; i++) {
            if (--count[ss[i] - 'a'] == 0) {
                remains--;
            }
            if (i >= n && ++count[ss[i - n] - 'a'] == 1) {
                remains++;
            }
            if (remains == 0) {
                result.add(i - n + 1);
            }
        }
        return result;
    }
}
