package leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.QUEUE)
@BeatsPercent(99.47)
@TimeComplexity(worst = Complexity.LINEARITHMIC_N)
@SpaceComplexity(worst = Complexity.LINEAR_N)
public class Problem950 {
    public int[] deckRevealedIncreasing(int[] deck) {
        int n = deck.length;
        Arrays.sort(deck);
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; ++i) {
            queue.add(i);
        }
        int[] result = new int[n];
        for (int card : deck) {
            result[queue.remove()] = card;
            queue.add(queue.poll());
        }
        return result;
    }
}
