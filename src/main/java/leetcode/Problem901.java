package leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.MONOTONIC_STACK)
@BeatsPercent(95.70)
@TimeComplexity(average = Complexity.CONSTANT)
@SpaceComplexity(average = Complexity.CONSTANT)
public class Problem901 {
    public class StockSpanner {
        private final Deque<int[]> stack = new ArrayDeque<>();

        public StockSpanner() {

        }

        public int next(int price) {
            int count = 1;
            while (!stack.isEmpty() && price >= stack.peek()[0]) {
                count += stack.remove()[1];
            }
            stack.push(new int[] {price, count});
            return count;
        }
    }
}
