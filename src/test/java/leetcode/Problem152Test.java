package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem152Test {
    private final Problem152 solution = new Problem152();

    @Test
    public void example1() {
        assertThat(solution.maxProduct(new int[] {2,3,-2,4}), is(6));
    }

    @Test
    public void example2() {
        assertThat(solution.maxProduct(new int[] {-2,0,-1}), is(0));
    }
}
