package leetcode;

import org.junit.Test;

import static java.util.Arrays.asList;
import static leetcode.Asserts.assertEquivalent;

public class Problem17Test {
    private Problem17 solution = new Problem17();

    @Test
    public void twoAndThree() {
        assertEquivalent(solution.letterCombinations("23"),
            asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"));
    }
}
