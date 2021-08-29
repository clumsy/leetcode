package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@BeatsPercent(95.24)
@Algorithms(Algorithm.SLIDING_WINDOW)
@TimeComplexity(Complexity.LINEAR_N)
@SpaceComplexity(Complexity.LINEAR_N)
public class Problem187 {
    public List<String> findRepeatedDnaSequences(String s) {
        Map<Integer, Integer> counts = new HashMap<>();
        int needed = (1 << 20) - 1; // 20 1s
        int mask = 0;
        int[] map = new int[26];
//        map['A' - 'A'] = 0b00;
        map['C' - 'A'] = 0b01;
        map['T' - 'A'] = 0b10;
        map['G' - 'A'] = 0b11;
        List<String> answer = new ArrayList<>();
        char[] ss = s.toCharArray();
        for (int i = 0; i < ss.length; i++) {
            mask = ((mask << 2) | map[ss[i] - 'A']) & needed;
            if (i >= 9) {
                int new_count = counts.compute(mask, (k, v) -> (v == null ? 0 : v) + 1);
                if (new_count == 2) { // second occurrence
                    answer.add(s.substring(i - 9, i + 1));
                }
            }
        }
        return answer;
    }
}
