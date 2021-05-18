import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class WineProblemTest {

    @Test
    public void solution1() {
        assertThat(WineProblem.Solution1.getMaxMoney(new int[]{2, 4, 6, 2, 5}), is(64));
    }

    @Test
    public void solution2() {
        assertThat(WineProblem.Solution2.getMaxMoney(new int[] {2,4,6,2,5}), is(64));
    }
}
