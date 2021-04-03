package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem540Test {
    private Problem540 solution = new Problem540();
    
    @Test
    public void example1() {
        assertThat(solution.singleNonDuplicate(new int[] {1,1,2,3,3,4,4,8,8}), is(2));
    }
    
    @Test
    public void example2() {
        assertThat(solution.singleNonDuplicate(new int[] {3,3,7,7,10,11,11}), is(10));
    }
    
    @Test
    public void example3() {
        assertThat(solution.singleNonDuplicate(new int[] {1,1,2,2,3}), is(3));
    }
    
    @Test
    public void example4() {
        assertThat(solution.singleNonDuplicate(new int[] {1,2,2,3,3}), is(1));
    }
}
