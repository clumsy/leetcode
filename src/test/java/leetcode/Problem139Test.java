package leetcode;

import org.junit.Test;

import java.util.Arrays;

public class Problem139Test {
    private final Problem139 solution = new Problem139();

    @Test
    public void example1() {
        assert solution.wordBreak("leetcode", Arrays.asList("leet", "code"));
    }

    @Test
    public void example2() {
        assert solution.wordBreak("applepenapple", Arrays.asList("apple", "pen"));
    }

    @Test
    public void example3() {
        assert !solution.wordBreak("catsandog", Arrays.asList("cats", "dog", "sand", "and", "cat"));
    }

    @Test
    public void example4() {
        assert !solution.wordBreak("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab",
          Arrays.asList("a","aa","aaa","aaaa","aaaaa","aaaaaa","aaaaaaa","aaaaaaaa","aaaaaaaaa","aaaaaaaaaa"));
    }
}
