package problem1;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static problem1.Problem1.twoSum;

public class Problem1Test {

    @Test
    public void array_2_7_11_15_and_target_9() {
        assertThat(twoSum(new int[] {2, 7, 11, 15}, 9), is(new int[] {0, 1}));
    }
}
