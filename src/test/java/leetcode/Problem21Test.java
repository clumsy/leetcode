package leetcode;

import org.junit.Test;

import static leetcode.ListNodes.list;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem21Test {
    private Problem21 solution = new Problem21();

    @Test
    public void simple() {
        assertThat(solution.mergeTwoLists(list(1, 2, 4), list(1, 3, 4)), is(list(1, 1, 2, 3, 4, 4)));
    }
}
