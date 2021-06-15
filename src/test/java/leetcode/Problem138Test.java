package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem138Test {
    private final Problem138 solution = new Problem138();
    
    @Test
    public void example1() {
        Problem138.Node list = solution.new Node(7);
        list.next = solution.new Node(13);
        list.next.random = list;
        list.next.next = solution.new Node(11);
        list.next.next.next = solution.new Node(10);
        list.next.next.next.random = list.next.next;
        list.next.next.next.next = solution.new Node(1);
        list.next.next.random = list.next.next.next.next;
        Problem138.Node result = solution.copyRandomList(list);
        assertThat(result != list, is(true));
        assertThat(result, is(list));
    }
}
