package leetcode;

import java.util.LinkedList;
import java.util.Queue;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.BREADTH_FIRST_SEARCH)
@BeatsPercent(98.54)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.LINEAR_N)
public class Problem1091 {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        if (grid[0][0] == 1 || grid[n - 1][n - 1] == 1) {
            return -1;
        }
        if (n == 1) {
            return 1;
        }
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        grid[0][0] = 1; // visited
        int length = 0;
        int[][] directions = {
            {0,+1},
            {0,-1},
            {+1,0},
            {-1,0},
            {+1,+1},
            {+1,-1},
            {-1,+1},
            {-1,-1}
        };
        while (!queue.isEmpty()) {
            length++;
            int size = queue.size();
            while (size-- > 0) {
                int i = queue.remove();
                if (i == n*n - 1) {
                    return length;
                }
                int r = i / n;
                int c = i % n;
                for (int[] d : directions) {
                    int r2 = r + d[0];
                    int c2 = c + d[1];
                    if (r2 >= 0 && r2 < n && c2 >= 0 && c2 < n && grid[r2][c2] == 0) {
                        queue.add(r2*n + c2);
                        grid[r2][c2] = 1; // visited
                    }
                }
            }
        }
        return -1;
    }
}
