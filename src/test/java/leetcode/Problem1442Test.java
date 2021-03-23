package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem1442Test {
    private final Problem1442 solution = new Problem1442();
    
    @Test
    public void example1() {
        assertThat(solution.countTriplets(new int[] {2,3,1,6,7}), is(4));
    }
    
    @Test
    public void example2() {
        assertThat(solution.countTriplets(new int[] {1,1,1,1,1}), is(10));
    }
    
    @Test
    public void example3() {
        assertThat(solution.countTriplets(new int[] {2,3}), is(0));
    }
    
    @Test
    public void example4() {
        assertThat(solution.countTriplets(new int[] {1,3,5,7,9}), is(3));
    }
    
    @Test
    public void example5() {
        assertThat(solution.countTriplets(new int[] {7,11,12,9,5,2,7,17,22}), is(8));
    }
}
