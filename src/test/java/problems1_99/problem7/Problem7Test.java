package problems1_99.problem7;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static problems1_99.problem7.Problem7.reverse;

public class Problem7Test {

    @Test
    public void positive123() {
        assertThat(reverse(123), is(321));
    }

    @Test
    public void negative123() {
        assertThat(reverse(-123), is(-321));
    }

    @Test
    public void positive120() {
        assertThat(reverse(120), is(21));
    }

    @Test
    public void positive1534236469() {
        assertThat(reverse(1534236469), is(0));
    }
}