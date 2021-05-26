package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem154Test {
    private Problem154 solution = new Problem154();
    
    @Test
    public void example1() {
        assertThat(solution.findMin(new int[] {1,3,5}), is(1));
    }
    
    @Test
    public void example2() {
        assertThat(solution.findMin(new int[] {2,2,2,0,1}), is(0));
    }
    
    @Test
    public void example3() {
        assertThat(solution.findMin(new int[] {1,3,3}), is(1));
    }
    
    @Test
    public void example4() {
        assertThat(solution.findMin(new int[] {3,3,1,3}), is(1));
    }
    
    @Test
    public void example5() {
        assertThat(solution.findMin(new int[] {1,1}), is(1));
    }
    
    @Test
    public void example6() {
        assertThat(solution.findMin(new int[] {10,1,10,10,10}), is(1));
    }
    
    @Test
    public void example7() {
        assertThat(solution.findMin(new int[] {2,0,1,1,1}), is(0));
    }
}
