package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.DEPTH_FIRST_SEARCH)
@BeatsPercent(100)
@SpaceComplexity(worst = Complexity.N_BY_M) // where N is the number of variables (vertices) and M is the number of equations (edges)
@TimeComplexity(worst = Complexity.N_BY_M)
public class Problem399 {
    private static final int MAX_N = 40;

    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        Map<String, Integer> vertex = new HashMap<>();
        double[][] weight = new double[MAX_N][MAX_N];
        for (int i = 0; i < equations.size(); i++) {
            Integer u = vertex.putIfAbsent(equations.get(i).get(0), vertex.size());
            if (u == null) {
                u = vertex.size() - 1;
            }
            Integer v = vertex.putIfAbsent(equations.get(i).get(1), vertex.size());
            if (v == null) {
                v = vertex.size() - 1;
            }
            weight[u][v] = 1*values[i];
            weight[v][u] = 1/values[i];
        }

        int n = vertex.size();
        boolean[] visited = new boolean[n];
        int m = queries.size();
        double[] answer = new double[m];
        for (int i = 0; i < m; i++) {
            Integer u = vertex.get(queries.get(i).get(0));
            if (u == null) {
                answer[i] = -1;
                continue;
            }
            Integer v = vertex.get(queries.get(i).get(1));
            if (v == null) {
                answer[i] = -1;
                continue;
            }
            Arrays.fill(visited, false);
            answer[i] = dfs(weight, visited, u, v, 1);
        }
        return answer;
    }

    private double dfs(double[][] weight, boolean[] visited, int current, int end, double value) {
        if (current == end) {
            return value;
        }
        visited[current] = true;
        for (int i = 0; i < weight.length; i++) {
            if (weight[current][i] > 0 && !visited[i]) {
                double result = dfs(weight, visited, i, end, value * weight[current][i]);
                if (result > 0) {
                    return result;
                }
            }
        }
        return -1;
    }
}
