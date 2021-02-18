package leetcode;

public class Problem1306 {
    public boolean canReach(int[] arr, int start) {
        boolean[] visited = new boolean[arr.length];
        return dfs(arr, visited, start);
    }

    private boolean dfs(int[] arr, boolean[] visited, int start) {
        if (start < 0 || start >= arr.length) {
            return false;
        }
        if (arr[start] == 0) {
            return true;
        }
        if (visited[start]) {
            return false;
        }
        visited[start] = true;
        return
            dfs(arr, visited, start - arr[start]) ||
            dfs(arr, visited, start + arr[start]);
    }
}
