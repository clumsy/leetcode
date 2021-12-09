package leetcode;

import java.util.ArrayList;
import java.util.List;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.ELIMINATION)
@BeatsPercent(55.45)
@TimeComplexity(worst = Complexity.N_PLUS_K) // where K = edges.size()
@SpaceComplexity(worst = Complexity.LINEAR_N)
public class Problem1557 {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        boolean[] has_parent = new boolean[n];
        for (List<Integer> edge : edges) {
            has_parent[edge.get(1)] = true;
        }
        List<Integer> has_no_parent = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            if (!has_parent[i]) {
                has_no_parent.add(i);
            }
        }
        return has_no_parent;
    }
}
