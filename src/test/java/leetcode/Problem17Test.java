package leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.Objects;

public class Problem17Test {
    private final Problem17 solution = new Problem17();

    @Test
    public void example1() {
        assert Objects.equals(solution.letterCombinations("23"),
            Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"));
    }

    @Test
    public void example2() {
        assert Objects.equals(solution.letterCombinations(""),
            Arrays.asList());
    }

    @Test
    public void example3() {
        assert Objects.equals(solution.letterCombinations("2"),
            Arrays.asList("a", "b", "c"));
    }
}
