package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem2007Test {
    private final Problem2007 solution = new Problem2007();
    
    @Test
    public void example1() {
        int[] changed = {1,3,4,2,6,8};
        assertThat(solution.findOriginalArray(changed), is(new int[] {4,3,1}));
    }
    
    @Test
    public void example2() {
        int[] changed = {6,3,0,1};
        assertThat(solution.findOriginalArray(changed), is(new int[0]));
    }
    
    @Test
    public void example3() {
        int[] changed = {1};
        assertThat(solution.findOriginalArray(changed), is(new int[0]));
    }
    
    @Test
    public void example4() {
        int[] changed = {0,0,0,0};
        assertThat(solution.findOriginalArray(changed), is(new int[0]));
    }
}
