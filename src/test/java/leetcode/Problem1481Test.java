package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem1481Test {
    private final Problem1481 solution = new Problem1481();
    
    @Test
    public void example1() {
        assertThat(solution.findLeastNumOfUniqueInts(new int[] {5,5,4}, 1), is(1));
    }
    
    @Test
    public void example2() {
        assertThat(solution.findLeastNumOfUniqueInts(new int[] {4,3,1,1,3,3,2}, 3), is(2));
    }
}
