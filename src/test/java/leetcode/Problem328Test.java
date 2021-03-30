package leetcode;

import org.hamcrest.core.Is;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem328Test {
    private final Problem328 solution = new Problem328();
    
    @Test
    public void example1() {
        ListNode list = ListNodes.list(1,2,3,4,5);
        assertThat(solution.oddEvenList(list), is(ListNodes.list(1,3,5,2,4)));
    }
}
