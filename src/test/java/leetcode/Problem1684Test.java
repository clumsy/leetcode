package leetcode;

import org.junit.Test;

public class Problem1684Test {
    private final Problem1684 solution = new Problem1684();
    
    @Test
    public void example1() {
        String[] words = {"ad","bd","aaab","baa","badab"};
        assert solution.countConsistentStrings("ab", words) == 2;
    }
    
    @Test
    public void example2() {
        String[] words = {"a","b","c","ab","ac","bc","abc"};
        assert solution.countConsistentStrings("abc", words) == 7;
    }
    
    @Test
    public void example3() {
        String[] words = {"cc","acd","b","ba","bac","bad","ac","d"};
        assert solution.countConsistentStrings("cad", words) == 4;
    }
}
