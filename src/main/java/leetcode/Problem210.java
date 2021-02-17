package leetcode;

import java.util.*;

public class Problem210 {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
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
        Stack<Integer> stack = new Stack<>();
        Set<Integer> finished = new HashSet<>();
        Set<Integer> visited = new HashSet<>();
        for (int i = 0; i < numCourses; i++) {
            int[] result = dfs(i, courseRequiredFor, finished, visited, stack);
            if (result != null) {
                return result;
            }
        }
        int i = 0;
        int[] result = new int[numCourses];
        while (!stack.isEmpty()) {
            result[i++] = stack.pop();
        }
        return result;
    }

    private static int[] dfs(int course, Map<Integer, List<Integer>> courseRequiredFor, Set<Integer> finished, Set<Integer> visited, Stack<Integer> stack) {
        if (finished.contains(course)) {
            return null;
        }
        if (visited.contains(course)) {
            return new int[0];
        }
        visited.add(course);
        List<Integer> requiredFor = courseRequiredFor.remove(course);
        if (requiredFor != null) {
            for (Integer requiredForCourse : requiredFor) {
                int[] result = dfs(requiredForCourse, courseRequiredFor, finished, visited, stack);
                if (result != null) {
                    return result;
                }
            }
        }
        visited.remove(course);
        finished.add(course);
        stack.push(course);
        return null;
    }
}
