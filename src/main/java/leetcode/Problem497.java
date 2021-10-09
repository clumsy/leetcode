package leetcode;

import java.util.Random;

public class Problem497 {
    class Solution {
        private final int[][] rects;
        private final int[] w;
        private final int sum;
        private final Random random = new Random();

        public Solution(int[][] rects) {
            this.rects = rects;
            int n = rects.length;
            this.w = new int[n];
            int sum = 0;
            for (int i = 0; i < n; i++) {
                int[] rect = rects[i];
                sum += (rect[2] - rect[0] + 1)*(rect[3] - rect[1] + 1); // including border
                w[i] = sum;
            }
            this.sum = sum;
        }

        public int[] pick() {
            int r = random.nextInt(sum + 1);
            int lo = 0;
            int hi = w.length - 1;
            while (lo < hi) {
                int mid = lo + (hi - lo)/2;
                if (r > w[mid]) {
                    lo = mid + 1;
                } else {
                    hi = mid;
                }
            }
            int[] rect = rects[lo];
            int x = rect[0] + random.nextInt(rect[2] - rect[0] + 1);
            int y = rect[1] + random.nextInt(rect[3] - rect[1] + 1);
            return new int[] {x, y};
        }
    }
}
