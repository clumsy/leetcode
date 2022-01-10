package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.PRIORITY_QUEUE)
@BeatsPercent(13.53)
@TimeComplexity(worst = Complexity.LINEARITHMIC_N)
@SpaceComplexity(worst = Complexity.LINEAR_N)
public class Problem1387 {
    public int getKth(int lo, int hi, int k) {
        Map<Integer, Integer> cache = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(k,
            (a, b) -> power(a, cache) - power(b, cache) != 0 ? power(a, cache) - power(b, cache) : a - b);
        for (int i = lo; i <= hi; ++i) {
            pq.add(i);
        }
        while (--k > 0) {
            pq.remove();
        }
        return pq.peek();
    }

    private int power(int x, Map<Integer, Integer> cache) {
        if (x == 1) {
            return 0;
        }
        Integer cached = cache.get(x);
        if (cached != null) {
            return cached;
        }
        cached = 1 + ((x & 1) == 0 ? power(x/2, cache) : power(3*x + 1, cache));
        cache.put(x, cached);
        return cached;
    }
}
