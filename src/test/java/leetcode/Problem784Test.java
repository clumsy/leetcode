package leetcode;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem784Test {
    private final Problem784 solution = new Problem784();
    
    @Test
    public void example1() {
        String[] expected = {"a1b2","a1B2","A1b2","A1B2"};
        assertThat(solution.letterCasePermutation("a1b2"), is(Arrays.asList(expected)));
    }
    
    @Test
    public void example2() {
        String[] expected = {"3z4","3Z4"};
        assertThat(solution.letterCasePermutation("3z4"), is(Arrays.asList(expected)));
    }
    
    @Test
    public void example3() {
        String[] expected = {"12345"};
        assertThat(solution.letterCasePermutation("12345"), is(Arrays.asList(expected)));
    }
    
    @Test
    public void example4() {
        String[] expected = {"0"};
        assertThat(solution.letterCasePermutation("0"), is(Arrays.asList(expected)));
    }
}
