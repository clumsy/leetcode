package leetcode;

import org.junit.Test;

import static leetcode.ListNodes.list;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem19Test {
    private Problem19 solution = new Problem19();

    @Test
    public void simple() {
        assertThat(solution.removeNthFromEnd(list(1, 2, 3, 4, 5), 2), is(list(1, 2, 3, 5)));
    }
}
