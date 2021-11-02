package leetcode;

import java.util.ArrayDeque;
import java.util.Queue;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.BREADTH_FIRST_SEARCH)
@BeatsPercent(58.74)
@TimeComplexity(worst = Complexity.N_BY_M)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem994 {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int fresh = 0;
        Queue<int[]> queue = new ArrayDeque<>();
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < m; c++) {
                if (grid[r][c] == 2) {
                    queue.add(new int[] {r,c});
                    grid[r][c] = 1;
                }
                if (grid[r][c] > 0) {
                    fresh++;
                }
            }
        }
        int minutes = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                int[] rotten = queue.remove();
                int r = rotten[0];
                int c = rotten[1];
                if (r < 0 || r >= n || c < 0 || c >= m || grid[r][c] != 1) {
                    continue;
                }
                grid[r][c] = 2;
                if (--fresh == 0) {
                    return minutes;
                }
                queue.add(new int[] {r - 1,c});
                queue.add(new int[] {r + 1,c});
                queue.add(new int[] {r,c - 1});
                queue.add(new int[] {r,c + 1});
            }
            minutes++;
        }
        return fresh == 0 ? minutes : -1;
    }
}
