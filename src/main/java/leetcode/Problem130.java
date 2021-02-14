package leetcode;

import java.util.HashSet;
import java.util.Set;

class Problem130 {
    public void solve(char[][] board) {
        UnionFind uf = new UnionFind(board.length*board[0].length);
        int rows = board.length;
        int cols = board[0].length;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (board[row][col] == 'X') {
                    continue;
                }
                if (row < rows - 1 && board[row + 1][col] == 'O') {
                    uf.union(row*cols + col, (row + 1)*cols + col);
                }
                if (col < cols - 1 && board[row][col + 1] == 'O') {
                    uf.union(row*cols + col, row*cols + col + 1);
                }
                if (row > 0 && board[row - 1][col] == 'O') {
                    uf.union(row*cols + col, (row - 1)*cols + col);
                }
                if (col > 0 && board[row][col - 1] == 'O') {
                    uf.union(row*cols + col, row*cols + col - 1);
                }
            }
        }

        Set<Integer> remains = new HashSet<>();
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (row == 0 || col == 0 || row == rows - 1 || col == cols - 1) {
                    remains.add(row*cols + col);
                }
            }
        }

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (board[row][col] == 'O' && !remains.contains(row*cols + col)) {
                    board[row][col] = 'X';
                }
            }
        }
    }

    private class UnionFind {
        private int[] parent;
        private int[] size;

        private UnionFind(int total) {
            this.parent = new int[total];
            this.size = new int[total];
            for (int i = 0; i < total; i++) {
                parent[i] = i;
                size[i] = 1;
            }
        }

        int find(int p) {
            if (p != parent[p]) { // path compression
                parent[p] = find(parent[p]);
                return parent[p];
            }
            return p;
        }

        void union(int p, int q) {
            int componentP = find(p);
            int componentQ = find(q);
            if (size[componentP] > size[componentQ]) {
                parent[componentQ] = componentP;
                size[componentP] += size[componentQ];
            } else {
                parent[componentP] = componentQ;
                size[componentQ] += size[componentP];
            }
        }
    }
}

