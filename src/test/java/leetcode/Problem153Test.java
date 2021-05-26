package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem153Test {
    private Problem153 solution = new Problem153();
    
    @Test
    public void example1() {
        assertThat(solution.findMin(new int[] {3,4,5,1,2}), is(1));
    }
    
    @Test
    public void example2() {
        assertThat(solution.findMin(new int[] {4,5,6,7,0,1,2}), is(0));
    }
    
    @Test
    public void example3() {
        assertThat(solution.findMin(new int[] {11,13,15,17}), is(11));
    }
    
    @Test
    public void example4() {
        assertThat(solution.findMin(new int[] {2,1}), is(1));
    }
}
