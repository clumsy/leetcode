package leetcode;

import org.junit.Test;

public class Problem433Test {
    private final Problem433 solution = new Problem433();
    
    @Test
    public void example1() {
        String[] bank = {"AACCGGTA"};
        assert solution.minMutation("AACCGGTT", "AACCGGTA", bank) == 1;
    }
    
    @Test
    public void example2() {
        String[] bank = {"AACCGGTA","AACCGCTA","AAACGGTA"};
        assert solution.minMutation("AACCGGTT", "AAACGGTA", bank) == 2;
    }
    
    @Test
    public void example3() {
        String[] bank = {"AAAACCCC","AAACCCCC","AACCCCCC"};
        assert solution.minMutation("AAAAACCC", "AACCCCCC", bank) == 3;
    }
    
    @Test
    public void example4() {
        String[] bank = {"AAAAAAAA","AAAAAAAC","AAAAAACC","AAAAACCC","AAAACCCC","AACACCCC","ACCACCCC","ACCCCCCC","CCCCCCCA","CCCCCCCC"};
        assert solution.minMutation("AAAAAAAA", "CCCCCCCC", bank) == 8;
    }
    
    @Test
    public void example5() {
        String[] bank = {"AAAAAAAA","AAAAAAAC","AAAAAACC","AAAAACCC","AAAACCCC","AACACCCC","ACCACCCC","ACCCCCCC","CCCCCCCA"};
        assert solution.minMutation("AAAAAAAA", "CCCCCCCC", bank) == -1;
    }
    
    @Test
    public void example6() {
        String[] bank = {"AATTCCGG","AACCTGGG","AACCCCGG","AACCTACC"};
        assert solution.minMutation("AACCTTGG", "AATTCCGG", bank) == -1;
    }
}
