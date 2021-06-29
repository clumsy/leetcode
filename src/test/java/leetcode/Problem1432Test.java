package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem1432Test {
    private final Problem1432 solution = new Problem1432();
    
    @Test
    public void example1() {
        assertThat(solution.maxDiff(555), is(888));
    }
    
    @Test
    public void example2() {
        assertThat(solution.maxDiff(9), is(8));
    }
    
    @Test
    public void example3() {
        assertThat(solution.maxDiff(123456), is(820000));
    }
    
    @Test
    public void example4() {
        assertThat(solution.maxDiff(10000), is(80000));
    }
    
    @Test
    public void example5() {
        assertThat(solution.maxDiff(9288), is(8700));
    }
}
