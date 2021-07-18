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
            if (first.size() >= second.size()) {
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
            if (first.size() < second.size() - 1) {
                first.offerLast(second.pollFirst());
            }
        }

        public int popFront() {
            if (!first.isEmpty()) {
                int val = safe(first.pollFirst());
                if (first.size() < second.size() - 1) {
                    first.offerLast(second.pollFirst());
                }
                return val;
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
                int val = safe(second.pollLast());
                if (first.size() > second.size()) {
                    second.offerFirst(first.pollLast());
                }
                return val;
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
