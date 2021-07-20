package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem611Test {
    private final Problem611 solution = new Problem611();
    
    @Test
    public void example1() {
        assertThat(solution.triangleNumber(new int[] {2,2,3,4}), is(3));
    }
    
    @Test
    public void example2() {
        assertThat(solution.triangleNumber(new int[] {4,2,3,4}), is(4));
    }
    
    @Test
    public void example3() {
        assertThat(solution.triangleNumber(new int[] {1,1,3,4}), is(0));
    }
    
    @Test
    public void example4() {
        assertThat(solution.triangleNumber(new int[] {7,0,0,0}), is(0));
    }
}
