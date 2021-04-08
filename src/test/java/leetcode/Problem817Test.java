package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem817Test {
    private final Problem817 solution = new Problem817();
    
    @Test
    public void example1() {
        ListNode list = ListNodes.list(0,1,2,3);
        assertThat(solution.numComponents(list, new int[] {0,1,3}), is(2));
    }
    
    @Test
    public void example2() {
        ListNode list = ListNodes.list(0,1,2,3,4);
        assertThat(solution.numComponents(list, new int[] {0,3,1,4}), is(2));
    }
}
