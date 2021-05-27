package leetcode;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem229Test {
    private final Problem229 solution = new Problem229();
    
    @Test
    public void example1() {
        assertThat(solution.majorityElement(new int[] {3,2,3}), is(Arrays.asList(3)));
    }
    
    @Test
    public void example2() {
        assertThat(solution.majorityElement(new int[] {1}), is(Arrays.asList(1)));
    }
    
    @Test
    public void example3() {
        assertThat(solution.majorityElement(new int[] {1,2}), is(Arrays.asList(1,2)));
    }
    
    @Test
    public void example4() {
        assertThat(solution.majorityElement(new int[] {0,3,4,0}), is(Arrays.asList(0)));
    }
    
    @Test
    public void example5() {
        assertThat(solution.majorityElement(new int[] {3,3,1,1,1,1,2,4,4,3,3,3,4,4}), is(Arrays.asList(3)));
    }
    
    @Test
    public void example6() {
        assertThat(solution.majorityElement(new int[] {2,1,1,3,1,4,5,6}), is(Arrays.asList(1)));
    }
}
