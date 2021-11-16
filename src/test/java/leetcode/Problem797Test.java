package leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.Objects;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem797Test {
    private final Problem797 solution = new Problem797();

    @Test
    public void example1() {
        int[][] graph = {{1,2},{3},{3},{}};
        assert Objects.equals(solution.allPathsSourceTarget(graph),
            Arrays.asList(
                Arrays.asList(0,1,3),
                Arrays.asList(0,2,3)));
    }

    @Test
    public void example2() {
        int[][] graph = {{4,3,1},{3,2,4},{3},{4},{}};
        assert Objects.equals(solution.allPathsSourceTarget(graph),
            Arrays.asList(
                Arrays.asList(0,4),
                Arrays.asList(0,3,4),
                Arrays.asList(0,1,3,4),
                Arrays.asList(0,1,2,3,4),
                Arrays.asList(0,1,4)));
    }

    @Test
    public void example3() {
        int[][] graph = {{1},{}};
        assert Objects.equals(solution.allPathsSourceTarget(graph),
            Arrays.asList(
                Arrays.asList(0,1)));
    }
}
