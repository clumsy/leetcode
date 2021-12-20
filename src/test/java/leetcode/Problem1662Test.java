package leetcode;

import org.junit.Test;

@Difficulty(Level.EASY)
@Algorithms(Algorithm.TWO_POINTERS)
@BeatsPercent(69.95)
@TimeComplexity(worst = Complexity.LINEAR_N) // where N is the shortest sum of word lengths
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem1662Test {
    private final Problem1662 solution = new Problem1662();
    
    @Test
    public void example1() {
        String[] word1 = {"ab","c"};
        String[] word2 = {"a","bc"};
        assert solution.arrayStringsAreEqual(word1, word2);
    }
    
    @Test
    public void example2() {
        String[] word1 = {"a","cb"};
        String[] word2 = {"ab","c"};
        assert !solution.arrayStringsAreEqual(word1, word2);
    }
    
    @Test
    public void example3() {
        String[] word1 = {"abc","d","defg"};
        String[] word2 = {"abcddefg"};
        assert solution.arrayStringsAreEqual(word1, word2);
    }
}
