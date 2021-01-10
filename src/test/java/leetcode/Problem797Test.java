package leetcode;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem797Test {
    private final Problem797 solution = new Problem797();

    @Test
    public void example1() {
        int[][] graph = new int[][] {{1,2},{3},{3},{}};
        assertThat(solution.allPathsSourceTarget(graph),
            is(Arrays.asList(
                Arrays.asList(0,1,3),
                Arrays.asList(0,2,3))));
    }
}
