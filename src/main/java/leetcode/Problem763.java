package leetcode;

import java.util.ArrayList;
import java.util.List;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.WAVEFRONT_EXPANSION)
@BeatsPercent(99.52)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem763 {
    public List<Integer> partitionLabels(String s) {
        char[] ss = s.toCharArray();
        int[] last = new int[26];
        for (int i = 0; i < ss.length; i++) {
            last[ss[i] - 'a'] = i;
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0, max = 0, start = 0; i < ss.length; i++) {
            max = Math.max(max, last[ss[i] - 'a']);
            if (i == max) {
                result.add(i + 1 - start);
                start = i + 1;
            }
        }
        return result;
    }
}
