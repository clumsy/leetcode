package leetcode;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.DEPTH_FIRST_SEARCH)
@BeatsPercent(87.15)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.LINEAR_N) // the stack depth
public class Problem841 {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        return dfs(rooms, 0, new HashSet<>(rooms.size(), 1), new boolean[rooms.size()]);
    }

    private boolean dfs(List<List<Integer>> rooms, int room, Set<Integer> visitable, boolean[] visited) {
        visitable.add(room);
        if (visitable.size() == rooms.size()) {
            return true;
        }
        for (int r : rooms.get(room)) {
            if (!visited[r]) {
                visited[r] = true;
                if (dfs(rooms, r, visitable, visited)) {
                    return true;
                }
            }
        }
        return false;
    }
}
