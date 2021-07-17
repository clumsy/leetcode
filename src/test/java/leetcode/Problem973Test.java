package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem973Test {
    private final Problem973 solution = new Problem973();
    
    @Test
    public void example1() {
        assertThat(solution.kClosest(new int[][] {{1,3}, {-2,2}}, 1), is(new int[][] {{-2,2}}));
    }
    
    @Test
    public void example2() {
        assertThat(solution.kClosest(new int[][] {{3,3}, {5,-1}, {-2,4}}, 2), is(new int[][] {{3,3}, {-2,4}}));
    }
}
