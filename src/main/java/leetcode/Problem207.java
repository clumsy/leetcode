package leetcode;

import java.util.*;

public class Problem207 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> courseRequiredFor = new HashMap<>();
        for (int[] prerequisite : prerequisites) {
            int course = prerequisite[1];
            int neededForCourse = prerequisite[0];
            List<Integer> requiredFor = courseRequiredFor.get(course);
            if (requiredFor == null) {
                requiredFor = new ArrayList<>();
                courseRequiredFor.put(course, requiredFor);
            }
            requiredFor.add(neededForCourse);
        }
        Set<Integer> visited = new HashSet<>();
        for (int i = 0; i < numCourses; i++) {
            if (!dfs(i, courseRequiredFor, visited)) {
                return false;
            }
        }
        return true;
    }

    private static boolean dfs(int course, Map<Integer, List<Integer>> courseRequiredFor, Set<Integer> visited) {
        if (visited.contains(course)) {
            return false;
        }
        List<Integer> requiredFor = courseRequiredFor.remove(course);
        if (requiredFor == null) {
            return true;
        }
        visited.add(course);
        for (Integer requiredForCourse : requiredFor) {
            if (!dfs(requiredForCourse, courseRequiredFor, visited)) {
                return false;
            }
        }
        visited.remove(course);
        return true;
    }
}
