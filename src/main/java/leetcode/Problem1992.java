package leetcode;

import java.util.ArrayList;
import java.util.List;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.DEPTH_FIRST_SEARCH)
@BeatsPercent(85.54)
@TimeComplexity(worst = Complexity.N_BY_M)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem1992 {
    public int[][] findFarmland(int[][] land) {
        int rows = land.length;
        int cols = land[0].length;
        List<int[]> groups = new ArrayList<>();
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (land[row][col] == 1) {
                    int row_max = row;
                    while (row_max + 1 < rows && land[row_max + 1][col] == 1) {
                        row_max++;
                    }

                    int col_max = col;
                    while (col_max + 1 < cols && land[row][col_max + 1] == 1) {
                        col_max++;
                    }

                    for (int r = row; r <= row_max; r++) {
                        for (int c = col; c <= col_max; c++) {
                            land[r][c] = 0;
                        }
                    }

                    groups.add(new int[] {row, col, row_max, col_max});
                }
            }
        }
        return groups.toArray(new int[0][0]);
    }
}
