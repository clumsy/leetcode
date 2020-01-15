package leetcode;

import org.junit.Test;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static leetcode.TreeNodes.treeOf;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem144Test {
    protected Problem144 solution = new Problem144();

    public static final class AlternativeTest extends Problem144Test {
        {
            this.solution = new Problem144.Alternative();
        }
    }

    @Test
    public void empty() {
        assertThat(solution.preorderTraversal(null), is(emptyList()));
    }

    @Test
    public void simple() {
        assertThat(solution.preorderTraversal(treeOf(1, null, 2, 3)), is(asList(1, 2, 3)));
    }

    @Test
    public void easy() {
        assertThat(solution.preorderTraversal(treeOf(3, 1, 2)), is(asList(3, 1, 2)));
    }
}
