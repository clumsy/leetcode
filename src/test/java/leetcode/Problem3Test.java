package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem3Test {

    @Test
    public void abcabcbb() {
        assertThat(Problem3.lengthOfLongestSubstring("abcabcbb"), is(3)); // "abc"
    }

    @Test
    public void bbbbb() {
        assertThat(Problem3.lengthOfLongestSubstring("bbbbb"), is(1)); // "b"
    }

    @Test
    public void pwwkew() {
        assertThat(Problem3.lengthOfLongestSubstring("pwwkew"), is(3)); // "wke"
    }

    @Test
    public void blank() {
        assertThat(Problem3.lengthOfLongestSubstring(" "), is(1));
    }

    @Test
    public void aab() {
        assertThat(Problem3.lengthOfLongestSubstring("aab"), is(2));
    }

    @Test
    public void abba() {
        assertThat(Problem3.lengthOfLongestSubstring("abba"), is(2));
    }
}
