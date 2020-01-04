package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem13Test {
    private Problem13 solution = new Problem13();

    @Test
    public void converts3() {
        assertThat(solution.romanToInt("III"), is(3));
    }

    @Test
    public void converts4() {
        assertThat(solution.romanToInt("IV"), is(4));
    }

    @Test
    public void converts9() {
        assertThat(solution.romanToInt("IX"), is(9));
    }

    @Test
    public void converts58() {
        assertThat(solution.romanToInt("LVIII"), is(58));
    }

    @Test
    public void converts1994() {
        assertThat(solution.romanToInt("MCMXCIV"), is(1994));
    }
}
