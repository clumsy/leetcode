package leetcode;

import java.util.ArrayList;
import java.util.List;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.DEPTH_FIRST_SEARCH)
@BeatsPercent(100)
@TimeComplexity(worst = Complexity.EXPONENTIAL_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem797 {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<Integer> path = new ArrayList<>();
        path.add(0);
        return dfs(new ArrayList<>(), graph, 0, path);
    }

    private List<List<Integer>> dfs(List<List<Integer>> result, int[][] graph, int current, List<Integer> path) {
        if (current == graph.length - 1) {
            result.add(new ArrayList<>(path));
            return result;
        }
        for (int next : graph[current]) {
            path.add(next);
            dfs(result, graph, next, path);
            path.remove(path.size() - 1);
        }
        return result;
    }
}
