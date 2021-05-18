import java.util.*;

public class HousesAndWells {
    
    static int minTotalDistance(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        List<int[][]> house_distances = new ArrayList<>();
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (grid[row][col] == 'H') {
                    int[][] house_distance = new int[rows][cols];
                    house_distances.add(house_distance);
                    for (int[] h : house_distance) {
                        Arrays.fill(h, Integer.MAX_VALUE);
                    }
                    boolean[][] visited = new boolean[rows][cols];
                    bfs(grid, row, col, house_distance, visited);
                }
            }
        }
        int answer = Integer.MAX_VALUE;
        for (int row = 0; row < rows; row++) {
            outer: for (int col = 0; col < cols; col++) {
                int current = 0;
                for (int[][] house_distance : house_distances) {
                    if (house_distance[row][col] == Integer.MAX_VALUE) {
                        continue outer;
                    }
                    current += house_distance[row][col];
                }
                answer = Math.min(answer, current);
            }
        }
        return answer;
    }

    private static void bfs(char[][] grid, int start_row, int start_col, int[][] house_distance, boolean[][] visited) {
        int rows = grid.length;
        int cols = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {start_row, start_col});
        int current = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                int[] next = queue.remove();
                int row = next[0];
                int col = next[1];
                visited[row][col] = true;
                house_distance[row][col] = current;
                if (row + 1 < rows && !visited[row + 1][col] && grid[row + 1][col] == '-') {
                    queue.add(new int[] {row + 1, col});
                }
                if (col + 1 < cols && !visited[row][col + 1] && grid[row][col + 1] == '-') {
                    queue.add(new int[] {row, col + 1});
                }
                if (col > 0 && !visited[row][col - 1] && grid[row][col - 1] == '-') {
                    queue.add(new int[] {row, col - 1});
                }
                if (row > 0 && !visited[row - 1][col] && grid[row - 1][col] == '-') {
                    queue.add(new int[] {row - 1, col});
                }
            }
            current++;
        }
    }

    public static void main(String[] args) {
        char[][] grid = {
            {'-', '-', '-', '-', '-'},
            {'-', 'H', 'T', '-', '-'},
            {'-', '-', 'H', 'T', '-'},
            {'-', '-', 'T', 'H', '-'},
            {'-', '-', '-', '-', '-'},
        };
        System.out.println(minTotalDistance(grid));
    }
}
