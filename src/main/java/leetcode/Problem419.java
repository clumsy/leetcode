package leetcode;

@BeatsPercent(100)
@TimeComplexity(Complexity.N_BY_M)
@SpaceComplexity(Complexity.CONSTANT)
public class Problem419 {
    public int countBattleships(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'X' &&
                        (i >= m - 1 || board[i + 1][j] == '.') &&
                        (j >= n - 1 || board[i][j + 1] == '.')) {
                    count++;
                }
            }
        }
        return count;
    }

//    public int countBattleships(char[][] board) {
//        int m = board.length;
//        int n = board[0].length;
//        int count = 0;
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                if (board[i][j] == 'X') {
//                    sink(board, i, j);
//                    count++;
//                }
//            }
//        }
//        return count;
//    }
//
//    private void sink(char[][] board, int i, int j) {
//        int m = board.length;
//        int n = board[0].length;
//        if (i < 0 || i >= m || j < 0 || j >= n) {
//            return;
//        }
//        if (board[i][j] == '.') {
//            return;
//        }
//        board[i][j] = '.';
//        sink(board, i + 1, j);
//        sink(board, i - 1, j);
//        sink(board, i, j + 1);
//        sink(board, i, j - 1);
//    }
}
