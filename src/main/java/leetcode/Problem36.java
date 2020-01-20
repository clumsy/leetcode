package leetcode;

public class Problem36 {
    public boolean isValidSudoku(char[][] board) {
        int[] cols = new int[9];
        int[] rows = new int[9];
        int[] boxes = new int[9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int c = board[i][j];
                if (c == '.') {
                    continue;
                }
                int digit = c - '0';
                int mask = 1 << digit;
                if ((cols[j] & mask) != 0) {
                    return false;
                }
                cols[j] |= mask;
                if ((rows[i] & mask) != 0) {
                    return false;
                }
                rows[i] |= mask;
                int k = 3*(i / 3) + j / 3;
                if ((boxes[k] & mask) != 0) {
                    return false;
                }
                boxes[k] |= mask;
            }
        }
        return true;
    }
}
