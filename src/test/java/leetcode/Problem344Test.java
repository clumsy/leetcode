package leetcode;

import org.junit.Test;

import java.util.Arrays;

public class Problem344Test {
    private final Problem344 solution = new Problem344();
    
    @Test
    public void example1() {
        char[] s = {'h','e','l','l','o'};
        solution.reverseString(s);
        assert Arrays.equals(s, new char[] {'o','l','l','e','h'});
    }
    
    @Test
    public void example2() {
        char[] s = {'H','a','n','n','a','h'};
        solution.reverseString(s);
        assert Arrays.equals(s, new char[] {'h','a','n','n','a','H'});
    }
}
