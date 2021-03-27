package leetcode;

import org.junit.Test;

import static org.hamcrest.core.AnyOf.anyOf;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class Problem398Test {
    private final Problem398 solution = new Problem398();
    
    @Test
    public void example1() {
        Problem398.Solution example1 = this.solution.new Solution(new int[] {1,2,2,3,3,3});
        assertThat(example1.pick(3), anyOf(equalTo(3), equalTo(4), equalTo(5)));
        assertThat(example1.pick(2), anyOf(equalTo(1), equalTo(2)));
        assertThat(example1.pick(1), is(0));
    }
}
