package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem242Test {
    private final Problem242 solution = new Problem242();
    
    @Test
    public void example1() {
        assertThat(solution.isAnagram("anagram", "nagaram"), is(true));
    }
    
    @Test
    public void example2() {
        assertThat(solution.isAnagram("rat", "car"), is(false));
    }
}
