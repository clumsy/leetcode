package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem1019Test {
    private final Problem1019 solution = new Problem1019();
    
    @Test
    public void example1() {
        ListNode list = ListNodes.list(2,1,5);
        assertThat(solution.nextLargerNodes(list), is(new int[] {5,5,0}));
    }
    
    @Test
    public void example2() {
        ListNode list = ListNodes.list(2,7,4,3,5);
        assertThat(solution.nextLargerNodes(list), is(new int[] {7,0,5,5,0}));
    }
    
    @Test
    public void example3() {
        ListNode list = ListNodes.list(1,7,5,1,9,2,5,1);
        assertThat(solution.nextLargerNodes(list), is(new int[] {7,9,9,9,0,5,0,0}));
    }
}
