package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem148Test {
    private final Problem148 solution = new Problem148();
    
    @Test
    public void example1() {
        ListNode list = ListNodes.list(4,2,1,3);
        assertThat(solution.sortList(list), is(ListNodes.list(1,2,3,4)));
    }
    
    @Test
    public void example2() {
        ListNode list = ListNodes.list(-1,5,3,4,0);
        assertThat(solution.sortList(list), is(ListNodes.list(-1,0,3,4,5)));
    }
}
