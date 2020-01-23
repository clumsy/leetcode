package leetcode;

import org.junit.Test;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;
import static leetcode.Asserts.assertEquivalent;

public class Problem49Test {
    protected Problem49 solution = new Problem49();

    public static final class AlternativeTest extends Problem49Test {
        {
            this.solution = new Problem49.Alternative();
        }
    }

    @Test
    public void simple() {
        assertEquivalent(solution.groupAnagrams(new String[] {"eat", "tea", "tan", "ate", "nat", "bat"}),
            asList(
                asList("eat", "tea", "ate"),
                asList("tan", "nat"),
                singletonList("bat")));
    }
}
