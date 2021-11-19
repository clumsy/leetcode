package leetcode;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.DEPTH_FIRST_SEARCH)
@BeatsPercent(97.05)
@TimeComplexity(worst = Complexity.N_BY_M_BY_THREE_TO_K) // where K is the length of the word
@SpaceComplexity(worst = Complexity.LINEAR_K) // depth of the stack
public class Problem79 {
    public boolean exist(char[][] board, String word) {
        char[] s = word.toCharArray();
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                if (board[r][c] == s[0] && dfs(board, r, c, s, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, int r, int c, char[] s, int i) {
        if (i == s.length) {
            return true;
        }
        if (r < 0 || r >= board.length || c < 0 || c >= board[0].length || board[r][c] != s[i]) {
            return false;
        }
        board[r][c] = '#';
        boolean result = // worst-case we will follow three directions (we came from one of four)
            dfs(board, r + 1, c, s, i + 1) ||
            dfs(board, r, c + 1, s, i + 1) ||
            dfs(board, r - 1, c, s, i + 1) ||
            dfs(board, r, c - 1, s, i + 1);
        board[r][c] = s[i];
        return result;
    }
}
