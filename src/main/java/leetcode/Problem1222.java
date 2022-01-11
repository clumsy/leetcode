package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.SIMULATION)
@BeatsPercent(44.69)
@TimeComplexity(worst = Complexity.CONSTANT)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem1222 {
    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        Set<Long> queens_set = new HashSet<>(64,1);
        for (int[] queen : queens) {
            queens_set.add(toLong(queen[0], queen[1]));
        }
        int[][] dirs = {
            {-1,-1},{-1,0},{-1,+1},
            { 0,-1},       { 0,+1},
            {+1,-1},{+1,0},{+1,+1},
        };
        List<List<Integer>> result = new ArrayList<>();
        for (int[] dir : dirs) {
            for (int r = king[0], c = king[1]; r >= 0 && r <= 63 && c >= 0 && c <= 63; r += dir[0], c += dir[1]) {
                if (queens_set.contains(toLong(r, c))) {
                    result.add(Arrays.asList(r, c));
                    break;
                }
            }
        }
        return result;
    }

    private static long toLong(int r, int c) {
        return (((long) r) << 32) + c;
    }
}
