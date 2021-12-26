package leetcode;

import org.junit.Test;

public class Problem2114Test {
    private final Problem2114 solution = new Problem2114();
    
    @Test
    public void example1() {
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        assert solution.mostWordsFound(sentences) == 6;
    }
    
    @Test
    public void example2() {
        String[] sentences = {"please wait", "continue to fight", "continue to win"};
        assert solution.mostWordsFound(sentences) == 3;
    }
}
