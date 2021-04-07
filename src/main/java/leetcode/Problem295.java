package leetcode;

import java.util.PriorityQueue;

@BeatsPercent(57.85)
//@TimeComplexity(Complexity.LOGARITHMIC_N) // addNum
//@TimeComplexity(Complexity.CONSTANT) // findMedian
@SpaceComplexity(Complexity.LINEAR_N)
public class Problem295 {
    class MedianFinder {
        private final PriorityQueue<Integer> low  = new PriorityQueue<>(42, (a, b) -> b - a); // max heap
        private final PriorityQueue<Integer> high = new PriorityQueue<>(42, (a, b) -> a - b); // min heap

        /** initialize your data structure here. */
        public MedianFinder() {

        }

        public void addNum(int num) {
            low.add(num);
            int max_low = low.remove(); // we added one to low, give one to high
            high.add(max_low);
            if (high.size() > low.size()) { // if high has more, make sure low has more
                low.add(high.remove());
            }
        }

        public double findMedian() {
            int n = low.size() + high.size();
            if ((n & 1) == 0) {
                return (low.peek() + high.peek())/2.; // size is equal, median is in between
            } else {
                return low.peek(); // low has more, hence has the median
            }
        }
    }

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
}
