package leetcode;

import java.util.ArrayDeque;
import java.util.Queue;

public class Problem210 {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] dependencyCount = new int[numCourses];
        for (int[] prerequisite : prerequisites) {
            int before = prerequisite[0];
            dependencyCount[before]++;
        }
        Queue<Integer> finishedCourses = new ArrayDeque<>(numCourses);
        int finishedCoursesCount = 0;
        int[] result = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            if (dependencyCount[i] == 0) {
                finishedCourses.add(i);
                result[finishedCoursesCount++] = i;
            }
        }
        while (!finishedCourses.isEmpty()) {
            int finishedCourse = finishedCourses.remove();
            for (int[] prerequisite : prerequisites) {
                if (prerequisite[1] == finishedCourse) {
                    int courseWithDependency = prerequisite[0];
                    if (--dependencyCount[courseWithDependency] == 0) {
                        finishedCourses.add(courseWithDependency);
                        result[finishedCoursesCount++] = courseWithDependency;
                    }
                }
            }
        }
        if (finishedCoursesCount != numCourses) {
            return new int[0];
        }
        return result;
    }
}
