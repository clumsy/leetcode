package leetcode;

import org.junit.Test;

import static leetcode.ListNodes.list;
import static leetcode.Problem2.addTwoNumbers;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class Problem2Test {

    @Test
    public void test() {
        assertThat(addTwoNumbers(list(2, 4, 3), list(5, 6, 4)), equalTo(list(7, 0, 8)));
    }
}
