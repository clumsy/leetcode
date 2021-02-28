package leetcode;

import static org.junit.Assert.assertThat;

import static org.hamcrest.core.Is.is;
import org.junit.Test;

public class Problem86Test {
    private final Problem86 solution = new Problem86();
    
    @Test
    public void example1() {
        ListNode list = ListNodes.list(1,4,3,2,5,2);
        assertThat(solution.partition(list, 3), is(ListNodes.list(1,2,2,4,3,5)));
    }
    
    @Test
    public void example2() {
        ListNode list = ListNodes.list(2,1);
        assertThat(solution.partition(list, 2), is(ListNodes.list(1,2)));
    }
}
