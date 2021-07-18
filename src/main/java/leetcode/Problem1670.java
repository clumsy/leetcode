package leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class Problem1670 {
    class FrontMiddleBackQueue {
        private final Deque<Integer> first = new ArrayDeque<>();
        private final Deque<Integer> second = new ArrayDeque<>();

        public FrontMiddleBackQueue() {

        }

        public void pushFront(int val) {
            first.offerFirst(val);
            if (first.size() - 1 > second.size()) {
                second.offerFirst(first.pollLast());
            }
        }

        public void pushMiddle(int val) {
            if (first.size() < second.size()) {
                first.offerLast(val);
            } else {
                second.offerFirst(val);
            }
        }

        public void pushBack(int val) {
            second.offerLast(val);
            if (second.size() > first.size()) {
                first.offerLast(second.pollFirst());
            }
        }

        public int popFront() {
            if (!first.isEmpty()) {
                return safe(first.pollFirst());
            }
            return safe(second.pollFirst());
        }

        public int popMiddle() {
            if (first.size() >= second.size()) {
                return safe(first.pollLast());
            }
            return safe(second.pollFirst());
        }

        public int popBack() {
            if (!second.isEmpty()) {
                return safe(second.pollLast());
            }
            return safe(first.pollLast());
        }

        private int safe(Integer val) {
            if (val != null) {
                return val;
            }
            return -1;
        }
    }
}
