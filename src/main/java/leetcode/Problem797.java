package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Problem797 {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> allPaths = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        path.add(0);
        findAllPathsFrom(0, graph, allPaths, path);
        return allPaths;
    }

    private void findAllPathsFrom(int current, int[][] graph, List<List<Integer>> allPaths, List<Integer> path) {
        if (current == graph.length - 1) {
            allPaths.add(new ArrayList<>(path));
            return;
        }
        for (int next : graph[current]) {
            path.add(next);
            findAllPathsFrom(next, graph, allPaths, path);
            path.remove(path.size() - 1);
        }
    }
}
