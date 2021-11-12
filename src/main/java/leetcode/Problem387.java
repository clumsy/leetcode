package leetcode;

import java.util.Arrays;
import java.util.PriorityQueue;

@Difficulty(Level.EASY)
@Algorithms(Algorithm.PRIORITY_QUEUE)
@BeatsPercent(72.30)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem387 {
    public int firstUniqChar(String s) {
        char[] ss = s.toCharArray();
        int[] prev = new int[26];
        Arrays.fill(prev, -1);
        PriorityQueue<Integer> pq = new PriorityQueue<>(26);
        for (int i = 0; i < ss.length; i++) {
            int c = ss[i] - 'a';
            if (prev[c] >= 0) {
                pq.remove(prev[c]);
            } else {
                pq.add(i);
            }
            prev[c] = i;
        }
        return pq.isEmpty() ? -1 : pq.remove();
    }
}
