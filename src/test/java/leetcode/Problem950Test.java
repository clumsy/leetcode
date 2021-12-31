package leetcode;

import org.junit.Test;

import java.util.Arrays;

public class Problem950Test {
    private final Problem950 solution = new Problem950();
    
    @Test
    public void example1() {
        int[] deck = {17,13,11,2,3,5,7};
        assert Arrays.equals(solution.deckRevealedIncreasing(deck),
            new int[] {2,13,3,11,5,17,7});
    }
    
    @Test
    public void example2() {
        int[] deck = {1,1000};
        assert Arrays.equals(solution.deckRevealedIncreasing(deck),
            new int[] {1,1000});
    }
}
