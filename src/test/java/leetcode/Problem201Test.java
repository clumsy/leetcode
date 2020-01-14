package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem201Test {
    protected Problem201 solution = new Problem201();

    public static final class AlternativeTest extends Problem201Test {
        {
            this.solution = new Problem201.Alternative();
        }
    }

    @Test
    public void oneToOne() {
        assertThat(solution.rangeBitwiseAnd(1, 1), is(1));
    }

    @Test
    public void fiveToSeven() {
        assertThat(solution.rangeBitwiseAnd(5, 7), is(4));
    }

    @Test
    public void fiveToEight() {
        assertThat(solution.rangeBitwiseAnd(5, 8), is(0));
    }

    @Test
    public void zeroToOne() {
        assertThat(solution.rangeBitwiseAnd(0, 1), is(0));
    }

    @Test
    public void oneToMax() {
        assertThat(solution.rangeBitwiseAnd(0, 2147483647), is(0));
    }

    @Test
    public void predMaxToMax() {
        assertThat(solution.rangeBitwiseAnd(2147483646, 2147483647), is(2147483646));
    }
}
