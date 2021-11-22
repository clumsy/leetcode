package leetcode;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem56Test {
    private final Problem56 solution = new Problem56();

    @Test
    public void example1() {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        assert Arrays.deepEquals(solution.merge(intervals),
            new int[][] {{1,6},{8,10},{15,18}});
    }

    @Test
    public void example2() {
        int[][] intervals = {{1,4},{4,5}};
        assert Arrays.deepEquals(solution.merge(intervals),
            new int[][] {{1,5}});
    }

    @Test
    public void example3() {
        int[][] intervals = {};
        assert Arrays.deepEquals(solution.merge(intervals),
            intervals);
    }

    @Test
    public void exampl4() {
        int[][] intervals = {{2,3},{2,2},{3,3},{1,3},{5,7},{2,2},{4,6}};
        assert Arrays.deepEquals(solution.merge(intervals),
            new int[][] {{1,3},{4,7}});
    }
}
