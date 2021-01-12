package leetcode;

public class Problem529 {
    public char[][] updateBoard(char[][] board, int[] click) {
        int row = click[0];
        int col = click[1];
        if (board[row][col] == 'M') {
            board[row][col] = 'X';
            return board;
        }
        int minesNearby = 0;
        if (row > 0) {
            if (col < board[0].length - 1 && board[row - 1][col + 1] == 'M') {
                minesNearby++;
            }
            if (board[row - 1][col] == 'M') {
                minesNearby++;
            }
            if (col > 0 && board[row - 1][col - 1] == 'M') {
                minesNearby++;
            }
        }
        if (col > 0) {
            if (board[row][col - 1] == 'M') {
                minesNearby++;
            }
            if (row < board.length - 1 && board[row + 1][col - 1] == 'M') {
                minesNearby++;
            }
        }
        if (row < board.length - 1) {
            if (board[row + 1][col] == 'M') {
                minesNearby++;
            }
            if (col < board[0].length - 1 && board[row + 1][col + 1] == 'M') {
                minesNearby++;
            }
        }
        if (col < board[0].length - 1 && board[row][col + 1] == 'M') {
            minesNearby++;
        }

        if (minesNearby == 0) {
            board[row][col] = 'B';
            if (row > 0) {
                if (col < board[0].length - 1 && board[row - 1][col + 1] == 'E') {
                    updateBoard(board, new int[]{row - 1, col + 1});
                }
                if (board[row - 1][col] == 'E') {
                    updateBoard(board, new int[]{row - 1, col});
                }
                if (col > 0 && board[row - 1][col - 1] == 'E') {
                    updateBoard(board, new int[]{row - 1, col - 1});
                }
            }
            if (col > 0 && board[row][col - 1] == 'E') {
                updateBoard(board, new int[]{row, col - 1});
            }
            if (row < board.length - 1) {
                if (col > 0 && board[row + 1][col - 1] == 'E') {
                    updateBoard(board, new int[]{row + 1, col - 1});
                }
                if (board[row + 1][col] == 'E') {
                    updateBoard(board, new int[]{row + 1, col});
                }
                if (col < board[0].length - 1 && board[row + 1][col + 1] == 'E') {
                    updateBoard(board, new int[]{row + 1, col + 1});
                }
            }
            if (col < board[0].length - 1 && board[row][col + 1] == 'E') {
                updateBoard(board, new int[]{row, col + 1});
            }
        } else {
            board[row][col] = (char) ('0' + minesNearby);
        }
        return board;
    }
}
