package leetcode;

import java.util.ArrayList;
import java.util.List;

@Difficulty(Level.EASY)
@Algorithms(Algorithm.STACK)
public class Problem155 {
    class MinStack {
        private final List<int[]> stack = new ArrayList<>();

        public MinStack() {

        }

        public void push(int val) {
            int min = Math.min(val, stack.isEmpty() ? Integer.MAX_VALUE : getMin());
            stack.add(new int[] {val, min});
        }

        public void pop() {
            stack.remove(stack.size() - 1);
        }

        public int top() {
            return stack.get(stack.size() - 1)[0];
        }

        public int getMin() {
            return stack.get(stack.size() - 1)[1];
        }
    }
}
