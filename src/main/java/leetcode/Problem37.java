package leetcode;

public class Problem37 {
    private static final class Cell {
        private int row;
        private int col;
        private int box;
    }

    public void solveSudoku(char[][] board) {
        Cell[] cellsToFill = new Cell[81];
        int cellsToFillCount = 0;
        int[] rows = new int[9];
        int[] cols = new int[9];
        int[] boxes = new int[9];
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                char value = board[row][col];
                int box = (row/3)*3 + (col/3);
                if (value == '.') {
                    Cell cell = new Cell();
                    cell.row = row;
                    cell.col = col;
                    cell.box = box;
                    cellsToFill[cellsToFillCount++] = cell;
                } else {
                    int mask = 1 << value - '1';
                    rows[row] |= mask;
                    cols[col] |= mask;
                    boxes[box] |= mask;
                }
            }
        }
        fill(0, board, cellsToFillCount, cellsToFill, rows, cols, boxes);
    }

    private boolean fill(
        int depth, char[][] board, int cellsToFillCount, Cell[] cellsToFill, int[] rows, int[] cols, int[] boxes
    ) {
        if (depth == cellsToFillCount) {
            return true;
        }
        Cell cell = cellsToFill[depth];
        for (int number = 1; number < 10; number++) {
            int mask = 1 << number - 1;
            if ((rows[cell.row] & mask) != 0 || (cols[cell.col] & mask) != 0 || (boxes[cell.box] & mask) != 0) {
                continue;
            }
            rows[cell.row] |= mask;
            cols[cell.col] |= mask;
            boxes[cell.box] |= mask;
            if (fill(depth + 1, board, cellsToFillCount, cellsToFill, rows, cols, boxes)) {
                board[cell.row][cell.col] = (char)('0' + number);
                return true;
            }
            board[cell.row][cell.col] = '.';
            rows[cell.row] ^= mask;
            cols[cell.col] ^= mask;
            boxes[cell.box] ^= mask;
        }
        return false;
    }
}
