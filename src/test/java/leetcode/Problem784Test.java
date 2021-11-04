package leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.Objects;

public class Problem784Test {
    private final Problem784 solution = new Problem784();
    
    @Test
    public void example1() {
        String[] expected = {"a1b2","a1B2","A1b2","A1B2"};
        assert Objects.equals(solution.letterCasePermutation("a1b2"), Arrays.asList(expected));
    }
    
    @Test
    public void example2() {
        String[] expected = {"3z4","3Z4"};
        assert Objects.equals(solution.letterCasePermutation("3z4"), Arrays.asList(expected));
    }
    
    @Test
    public void example3() {
        String[] expected = {"12345"};
        assert Objects.equals(solution.letterCasePermutation("12345"), Arrays.asList(expected));
    }
    
    @Test
    public void example4() {
        String[] expected = {"0"};
        assert Objects.equals(solution.letterCasePermutation("0"), Arrays.asList(expected));
    }
}
