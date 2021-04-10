package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem849Test {
    private final Problem849 solution = new Problem849();
    
    @Test
    public void example1() {
        assertThat(solution.maxDistToClosest(new int[] {1,0,0,0,1,0,1}), is(2));
    }
    
    @Test
    public void example2() {
        assertThat(solution.maxDistToClosest(new int[] {1,0,0,0}), is(3));
    }
    
    @Test
    public void example3() {
        assertThat(solution.maxDistToClosest(new int[] {0,1}), is(1));
    }
}
