package leetcode;

import java.util.function.IntConsumer;

@BeatsPercent(99.85)
public class Problem1116 {
    class ZeroEvenOdd {
        private int n;

        public ZeroEvenOdd(int n) {
            this.n = n;
        }

        // printNumber.accept(x) outputs "x", where x is an integer.
        public void zero(IntConsumer printNumber) throws InterruptedException {
            printNumber.accept(0);
        }

        public void even(IntConsumer printNumber) throws InterruptedException {
            if (n < 2) {
                return;
            }
            int k = 10;
            int p = n - 1;
            while (p-- > 0) {
                printNumber.accept(k);
                k += 10;
            }
            if (n % 2 == 0) {
                printNumber.accept(n);
            }
        }

        public void odd(IntConsumer printNumber) throws InterruptedException {
            if (n % 2 == 1) {
                printNumber.accept(n);
            }
        }
    }
}
