package leetcode;

import java.util.ArrayList;
import java.util.List;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.BUCKET_SORT)
@BeatsPercent(99.20)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.LINEAR_N)
public class Problem451 {
    public String frequencySort(String s) {
        int[] count = new int[256];
        char[] ss = s.toCharArray();
        List<Character>[] buckets = new List[ss.length + 1];
        for (char c : ss) {
            ++count[c];
        }
        for (int c = 0; c < count.length; ++c) {
            if (buckets[count[c]] == null) {
                buckets[count[c]] = new ArrayList<>(count.length);
            }
            buckets[count[c]].add((char) c);
        }
        StringBuilder sb = new StringBuilder(ss.length);
        for (int i = buckets.length - 1; i >= 0; --i) {
            if (buckets[i] != null) {
                for (int c : buckets[i]) {
                    for (int j = 0; j < i; ++j) {
                        sb.append((char) c);
                    }
                }
            }
        }
        return sb.toString();
    }
}
