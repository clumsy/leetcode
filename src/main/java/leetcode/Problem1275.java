package leetcode;

@Difficulty(Level.EASY)
@Algorithms(Algorithm.SIMULATION)
@BeatsPercent(100)
@TimeComplexity(worst = Complexity.CONSTANT)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem1275 {
    public String tictactoe(int[][] moves) {
        int[] a = new int[8]; // 3 rows + 3 cols + 2 diags
        int[] b = new int[8]; // 3 rows + 3 cols + 2 diags
        boolean is_x = true;
        for (int[] move : moves) {
            int[] p = is_x ? a : b;
            if (++p[move[0]] == 3) {
                return is_x ? "A" : "B";
            }
            if (++p[move[1] + 3] == 3) {
                return is_x ? "A" : "B";
            }
            if (move[0] == move[1] && ++p[6] == 3) {
                return is_x ? "A" : "B";
            }
            if (move[0] + move[1] == 2 && ++p[7] == 3) {
                return is_x ? "A" : "B";
            }
            is_x = !is_x;
        }
        return moves.length == 9 ? "Draw" : "Pending";
    }
}
