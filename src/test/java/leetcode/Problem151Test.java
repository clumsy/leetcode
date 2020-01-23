package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem151Test {
    protected Problem151 solution = new Problem151();

    public static final class AlternativeTest extends Problem151Test {
        {
            this.solution = new Problem151.Alternative();
        }
    }

    @Test
    public void theSkyIsBlue() {
        assertThat(solution.reverseWords("the sky is blue"), is("blue is sky the"));
    }

    @Test
    public void empty() {
        assertThat(solution.reverseWords(""), is(""));
    }

    @Test
    public void blank() {
        assertThat(solution.reverseWords(" "), is(""));
    }

    @Test
    public void helloWorld() {
        assertThat(solution.reverseWords("  hello world!  "), is("world! hello"));
    }

    @Test
    public void aGoodExample() {
        assertThat(solution.reverseWords("a good   example"), is("example good a"));
    }
}
