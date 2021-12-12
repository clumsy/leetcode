package leetcode;

import java.util.ArrayList;
import java.util.List;

@Difficulty(Level.MEDIUM)
@BeatsPercent(27.69)
@Algorithms(Algorithm.LAZY_UPDATE)
public class Problem1476 {
    class SubrectangleQueries {
        private final int[][] rectangle;
        private final List<int[]> operations = new ArrayList<>();

        public SubrectangleQueries(int[][] rectangle) {
            this.rectangle = rectangle;
        }

        @TimeComplexity(worst = Complexity.CONSTANT)
        @SpaceComplexity(worst = Complexity.CONSTANT)
        public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
            operations.add(new int[] {row1, col1, row2, col2, newValue});
        }

        @TimeComplexity(worst = Complexity.LINEAR_N) // where N is the number of operations
        @SpaceComplexity(worst = Complexity.CONSTANT)
        public int getValue(int row, int col) {
            for (int i = operations.size() - 1; i >= 0; --i) {
                int[] op = operations.get(i);
                if (op[0] <= row && row <= op[2] && op[1] <= col && col <= op[3]) {
                    return op[4];
                }
            }
            return rectangle[row][col];
        }
    }
}
