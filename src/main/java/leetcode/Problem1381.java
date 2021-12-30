package leetcode;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.LAZY_UPDATE)
@BeatsPercent(42.09)
public class Problem1381 {
    class CustomStack {
        private final int[] increment;
        private final int[] stack;
        private int size;

        @TimeComplexity(worst = Complexity.LINEAR_N)
        @SpaceComplexity(worst = Complexity.LINEAR_N)
        public CustomStack(int maxSize) {
            this.increment = new int[maxSize];
            this.stack = new int[maxSize];
        }

        @TimeComplexity(worst = Complexity.CONSTANT)
        @SpaceComplexity(worst = Complexity.CONSTANT)
        public void push(int x) {
            if (size >= stack.length) {
                return;
            }
            stack[size] = x;
            increment[size++] = 0;
        }

        @TimeComplexity(worst = Complexity.CONSTANT)
        @SpaceComplexity(worst = Complexity.CONSTANT)
        public int pop() {
            if (size == 0) {
                return -1;
            }
            if (--size > 0) {
                increment[size - 1] += increment[size];
            }
            return stack[size] + increment[size];
        }

        @TimeComplexity(worst = Complexity.CONSTANT)
        @SpaceComplexity(worst = Complexity.CONSTANT)
        public void increment(int k, int val) {
            if (size > 0) {
                increment[Math.min(size, k) - 1] += val;
            }
        }
    }


}
