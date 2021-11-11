package leetcode;

import org.junit.Test;

import java.util.Objects;

public class Problem82Test {
    private final Problem82 solution = new Problem82();

    @Test
    public void example1() {
        ListNode list = ListNodes.list(1,2,3,3,4,4,5);
        assert Objects.equals(solution.deleteDuplicates(list), ListNodes.list(1,2,5));
    }

    @Test
    public void example2() {
        ListNode list = ListNodes.list(1,1,1,2,3);
        assert Objects.equals(solution.deleteDuplicates(list), ListNodes.list(2,3));
    }
}
