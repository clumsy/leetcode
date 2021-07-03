package leetcode;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem658Test {
    private final Problem658 solution = new Problem658();
    
    @Test
    public void example1() {
        assertThat(solution.findClosestElements(new int[] {1,2,3,4,5}, 4, 3), is(Arrays.asList(1,2,3,4)));
    }
    
    @Test
    public void example2() {
        assertThat(solution.findClosestElements(new int[] {1,2,3,4,5}, 4, 3), is(Arrays.asList(1,2,3,4)));
    }
}
