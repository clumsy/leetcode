package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem12Test {
    protected Problem12 solution = new Problem12();

    public static class AlternativeTest extends Problem12Test {
        {
            this.solution = new Problem12.Alternative();
        }
    }

    public static class Alternative2Test extends Problem12Test {
        {
            this.solution = new Problem12.Alternative2();
        }
    }

    @Test
    public void converts3() {
        assertThat(solution.intToRoman(3), is("III"));
    }

    @Test
    public void converts9() {
        assertThat(solution.intToRoman(9), is("IX"));
    }

    @Test
    public void converts58() {
        assertThat(solution.intToRoman(58), is("LVIII"));
    }

    @Test
    public void converts1994() {
        assertThat(solution.intToRoman(1994), is("MCMXCIV"));
    }
}
