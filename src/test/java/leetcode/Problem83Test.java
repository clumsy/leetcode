package leetcode;

import org.junit.Test;

import java.util.Objects;

public class Problem83Test {
    private final Problem83 solution = new Problem83();

    @Test
    public void example1() {
        ListNode list = ListNodes.list(1,1,2);
        assert Objects.equals(solution.deleteDuplicates(list), ListNodes.list(1,2));
    }

    @Test
    public void example2() {
        ListNode list = ListNodes.list(1,1,2,3,3);
        assert Objects.equals(solution.deleteDuplicates(list), ListNodes.list(1,2,3));
    }

    @Test
    public void example3() {
        ListNode list = ListNodes.list(1,1,1);
        assert Objects.equals(solution.deleteDuplicates(list), ListNodes.list(1));
    }
}
