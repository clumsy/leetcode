package leetcode;

import org.junit.Test;

import java.util.Objects;

public class Problem24Test {
    private final Problem24 solution = new Problem24();

    @Test
    public void example1() {
        ListNode list = ListNodes.list(1,2,3,4);
        assert Objects.equals(solution.swapPairs(list), ListNodes.list(2,1,4,3));
    }

    @Test
    public void example2() {
        ListNode list = ListNodes.list(1,2,3);
        assert Objects.equals(solution.swapPairs(list), ListNodes.list(2,1,3));
    }
}
