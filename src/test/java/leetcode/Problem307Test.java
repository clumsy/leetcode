package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem307Test {
    private final Problem307 solution = new Problem307();
    
    @Test
    public void example1() {
        Problem307.NumArray array = solution.new NumArray(new int[] {1,3,5});
        assertThat(array.sumRange(0,2), is(9));
        array.update(1,2);
        assertThat(array.sumRange(0,2), is(8));
    }
}
