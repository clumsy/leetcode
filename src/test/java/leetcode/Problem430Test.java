package leetcode;

import org.hamcrest.core.Is;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem430Test {
    private final Problem430 solution = new Problem430();
    
    @Test
    public void example2() { // 1,2,null,3
        Problem430.Node list = solution.new Node();
        list.val = 1;
        Problem430.Node one = list;
        one.child = solution.new Node();
        one.child.val = 3;
        list.next = solution.new Node();
        list.next.val = 2;
        
        Problem430.Node expected = solution.new Node();
        expected.val = 1;
        expected.next = solution.new Node();
        expected.next.val = 3;
        expected.next.next = solution.new Node();
        expected.next.next.val = 2;
        assertThat(solution.flatten(list), is(expected));
    }
}
