package leetcode;

import static org.hamcrest.core.Is.is;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class Problem6Test {

    @Test
    public void paypalIsHiring3() {
        assertThat(new Problem6().convert("PAYPALISHIRING", 3), is("PAHNAPLSIIGYIR"));
    }

    @Test
    public void paypalIsHiring4() {
        assertThat(new Problem6().convert("PAYPALISHIRING", 4), is("PINALSIGYAHRPI"));
    }

    @Test
    public void a1() {
        assertThat(new Problem6().convert("A", 1), is("A"));
    }
}
