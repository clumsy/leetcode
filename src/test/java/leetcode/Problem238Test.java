package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem238Test {
    private final Problem238 solution = new Problem238();
    
    @Test
    public void example1() {
        assertThat(solution.productExceptSelf(new int[] {1,2,3,4}), is(new int[] {24,12,8,6}));
    }
    
    @Test
    public void example2() {
        assertThat(solution.productExceptSelf(new int[] {-1,1,0,-3,3}), is(new int[] {0,0,9,0,0}));
    }
}
