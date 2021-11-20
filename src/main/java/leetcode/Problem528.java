package leetcode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Random;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.ALIAS_METHOD)
@BeatsPercent(71.03)
public class Problem528 {
    static class Solution {
        private static final double EPSILON = 1e-6;

        private static final class Box {
            private final int small;
            private final int big;
            private final double division;

            private Box(int small, int big, double division) {
                this.small = small;
                this.big = big;
                this.division = division;
            }
        }

        private static final class BoxWeight {
            private final int i;
            private double weight;

            private BoxWeight(int i, double weight) {
                this.i = i;
                this.weight = weight;
            }
        }

        private final Box[] boxes;
        private final Random random = new Random();

        @TimeComplexity(worst = Complexity.LINEAR_N)
        @SpaceComplexity(worst = Complexity.LINEAR_N)
        public Solution(int[] w) {
            double sum = 0;
            for (int num : w) {
                sum += num;
            }
            int n = w.length;
            Deque<BoxWeight> bigs = new ArrayDeque<>(n);
            Deque<BoxWeight> smalls = new ArrayDeque<>(n);
            double threshold = 1. / n;
            for (int i = 0; i < n; i++) {
                BoxWeight box = new BoxWeight(i, w[i] / sum);
                if (box.weight >= threshold) {
                    bigs.add(box);
                } else {
                    smalls.add(box);
                }
            }
            this.boxes = new Box[n];
            int i = 0;
            while (!smalls.isEmpty()) {
                BoxWeight small = smalls.removeLast();
                BoxWeight big = bigs.getLast(); // not removing just yet
                big.weight -= threshold - small.weight;
                if (big.weight < threshold - EPSILON) { // check if it's a smaller one now
                    smalls.addLast(bigs.removeLast());
                }
                boxes[i++] = new Box(small.i, big.i, small.weight / threshold);
            }
            while (!bigs.isEmpty()) {
                boxes[i++] = new Box(-1, bigs.removeLast().i, 0);
            }
        }

        @TimeComplexity(worst = Complexity.CONSTANT)
        @SpaceComplexity(worst = Complexity.CONSTANT)
        public int pickIndex() {
            Box box = boxes[random.nextInt(boxes.length)];
            if (box.small < 0) { // fully taken by the bigger box
                return box.big;
            }
            double weight = random.nextDouble();
            return weight >= box.division ? box.big : box.small;
        }
    }
}
