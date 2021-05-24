package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem128Test {
    private final Problem128 solution = new Problem128();
    
    @Test
    public void example1() {
        assertThat(solution.longestConsecutive(new int[] {100,4,200,1,3,2}), is(4));
    }
    
    @Test
    public void example2() {
        assertThat(solution.longestConsecutive(new int[] {0,3,7,2,5,8,4,6,0,1}), is(9));
    }
    
    @Test
    public void example3() {
        assertThat(solution.longestConsecutive(new int[] {0}), is(1));
    }
    
    @Test
    public void example4() {
        assertThat(solution.longestConsecutive(new int[] {0,-1}), is(2));
    }
    
    @Test
    public void example5() {
        assertThat(solution.longestConsecutive(new int[] {-1,1,0}), is(3));
    }
    
    @Test
    public void example6() {
        assertThat(solution.longestConsecutive(new int[]{1, 2, 0, 1}), is(3));
    }
    
    @Test
    public void example7() {
        assertThat(solution.longestConsecutive(new int[] {7,-2,9,9,1,9,8,-4,6,-6,-6,4,1,3,6,3,5,-2,3,4,-6,1,5,-9,6,1,2,-2,1}), is(9));
    }
}
