package leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.Objects;

public class Problem438Test {
    private final Problem438 solution = new Problem438();
    
    @Test
    public void example1() {
        assert Objects.equals(solution.findAnagrams("cbaebabacd", "abc"),
            Arrays.asList(0,6));
    }
    
    @Test
    public void example2() {
        assert Objects.equals(solution.findAnagrams("abab", "ab"),
            Arrays.asList(0,1,2));
    }
}
