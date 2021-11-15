package leetcode;

import java.util.ArrayList;
import java.util.List;

@Difficulty(Level.EASY)
@Algorithms(Algorithm.STACK)
public class Problem232 {
    class MyQueue {
        private final List<Integer> first = new ArrayList<>();
        private final List<Integer> second = new ArrayList<>();

        @TimeComplexity(worst = Complexity.CONSTANT)
        @SpaceComplexity(worst = Complexity.CONSTANT)
        public void push(int x) {
            second.add(x);
        }

        private void move() {
            while (!second.isEmpty()) {
                first.add(second.remove(second.size() - 1));
            }
        }

        @TimeComplexity(average = Complexity.CONSTANT, worst = Complexity.LINEAR_N)
        @SpaceComplexity(worst = Complexity.CONSTANT)
        public int pop() {
            if (first.isEmpty()) {
                move();
            }
            return first.remove(first.size() - 1);
        }

        @TimeComplexity(average = Complexity.CONSTANT, worst = Complexity.LINEAR_N)
        @SpaceComplexity(worst = Complexity.CONSTANT)
        public int peek() {
            if (first.isEmpty()) {
                move();
            }
            return first.get(first.size() - 1);
        }

        @TimeComplexity(worst = Complexity.CONSTANT)
        @SpaceComplexity(worst = Complexity.CONSTANT)
        public boolean empty() {
            return first.isEmpty() && second.isEmpty();
        }
    }
}
