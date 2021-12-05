package leetcode;

import org.junit.Test;

import java.util.Arrays;

import static leetcode.Asserts.assertEquivalent;

public class Problem49Test {
    private final Problem49 solution = new Problem49();

    @Test
    public void example1() {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        assertEquivalent(solution.groupAnagrams(strs),
            Arrays.asList(
                Arrays.asList("eat","tea","ate"),
                Arrays.asList("tan","nat"),
                Arrays.asList("bat")));
    }
}
