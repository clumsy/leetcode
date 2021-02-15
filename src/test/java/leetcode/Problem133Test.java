package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem133Test {
    private final Problem133 solution = new Problem133();

    @Test
    public void example1() {
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        first.children.add(second);
        first.children.add(fourth);
        second.children.add(first);
        second.children.add(third);
        third.children.add(second);
        third.children.add(fourth);
        fourth.children.add(first);
        fourth.children.add(third);

        Node result = solution.cloneGraph(first);
        assertThat(result.val, is(first.val));
        assertThat(result.children.size(), is(2));
        assertThat(result.children.get(0).val, is(second.val));
        assertThat(result.children.get(0).children.size(), is(2));
        assertThat(result.children.get(0).children.get(0).val, is(first.val));
        assertThat(result.children.get(0).children.get(1).val, is(third.val));
        assertThat(result.children.get(0).children.get(1).children.size(), is(2));
        assertThat(result.children.get(0).children.get(1).children.get(0).val, is(second.val));
        assertThat(result.children.get(0).children.get(1).children.get(1).val, is(fourth.val));
        assertThat(result.children.get(1).val, is(fourth.val));
        assertThat(result.children.get(1).children.size(), is(2));
        assertThat(result.children.get(1).children.get(0).val, is(first.val));
        assertThat(result.children.get(1).children.get(1).val, is(third.val));
    }
}
