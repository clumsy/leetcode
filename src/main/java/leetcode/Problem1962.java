package leetcode;

import java.util.PriorityQueue;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.HEAP)
@BeatsPercent(94.34)
@TimeComplexity(worst = Complexity.K_LOG_N) // where N is the number of piles
@SpaceComplexity(worst = Complexity.LINEAR_N)
public class Problem1962 {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(piles.length, (a, b) -> b - a);
        int remains = 0;
        for (int pile : piles) {
            pq.add(pile);
            remains += pile;
        }
        while (k-- > 0) {
            int pile = pq.remove();
            if (pile == 0) {
                break;
            }
            pq.add(pile - pile/2);
            remains -= pile/2;
        }
        return remains;
    }
}
