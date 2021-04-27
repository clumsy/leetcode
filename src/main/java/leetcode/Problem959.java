package leetcode;

@BeatsPercent(89.74)
@TimeComplexity(Complexity.N_BY_M) // where N is the number of strings, M is the string length
@SpaceComplexity(Complexity.N_BY_M)
public class Problem959 {
    public int regionsBySlashes(String[] grid) {
        int count = 0;
        int rows = grid.length;
        int cols = grid[0].length();
        boolean[][][] visited = new boolean[rows][cols][4];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                for (int i = 0; i < 3; i++) {
                    if (!visited[row][col][i]) {
                        dfs(grid, visited, row, col, i);
                        count++;
                    }
                }
            }
        }
        return count;
    }

    private void dfs(String[] grid, boolean[][][] visited, int row, int col, int i) {
        if (row < 0 || col < 0 || row >= grid.length || col >= grid[0].length() || visited[row][col][i]) {
            return;
        }
        visited[row][col][i] = true;
        char c = grid[row].charAt(col);
        switch (i) {
            case 0: // top
                dfs(grid, visited, row - 1, col, 2); // can go up regardless
                if (c == '/') {
                    dfs(grid, visited, row, col, 1);
                } else if (c == '\\') {
                    dfs(grid, visited, row, col, 3);
                } else {
                    dfs(grid, visited, row, col, 1);
                    dfs(grid, visited, row, col, 2);
                    dfs(grid, visited, row, col, 3);
                }
                break;
            case 1: // left
                dfs(grid, visited, row, col - 1, 3); // can go left regardless
                if (c == '/') {
                    dfs(grid, visited, row, col, 0);
                } else if (c == '\\') {
                    dfs(grid, visited, row, col, 2);
                } else {
                    dfs(grid, visited, row, col, 0);
                    dfs(grid, visited, row, col, 2);
                    dfs(grid, visited, row, col, 3);
                }
                break;
            case 2: // bottom
                dfs(grid, visited, row + 1, col, 0); // can go down regardless
                if (c == '/') {
                    dfs(grid, visited, row, col, 3);
                } else if (c == '\\') {
                    dfs(grid, visited, row, col, 1);
                } else {
                    dfs(grid, visited, row, col, 0);
                    dfs(grid, visited, row, col, 1);
                    dfs(grid, visited, row, col, 3);
                }
                break;
            case 3: // right
                dfs(grid, visited, row, col + 1, 1); // can go right regardless
                if (c == '/') {
                    dfs(grid, visited, row, col, 2);
                } else if (c == '\\') {
                    dfs(grid, visited, row, col, 0);
                } else {
                    dfs(grid, visited, row, col, 0);
                    dfs(grid, visited, row, col, 1);
                    dfs(grid, visited, row, col, 2);
                }
                break;
            default: assert false;
        }
    }
}
