package leetcode;

import org.junit.Test;

import java.util.Arrays;

public class Problem890Test {
    private final Problem890 solution = new Problem890();
    
    @Test
    public void example1() {
        String[] words = {"abc","deq","mee","aqq","dkd","ccc"};
        assert solution.findAndReplacePattern(words, "abb").equals(Arrays.asList("mee","aqq"));
    }
    
    @Test
    public void example2() {
        String[] words = {"a","b","c"};
        assert solution.findAndReplacePattern(words, "a").equals(Arrays.asList("a","b","c"));
    }
    
    @Test
    public void example3() {
        String[] words = {"badc","abab","dddd","dede","yyxx"};
        assert solution.findAndReplacePattern(words, "baba").equals(Arrays.asList("abab","dede"));
    }
}
