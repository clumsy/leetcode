package leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.Objects;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;
import static leetcode.TreeNodes.treeOf;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem103Test {
    private final Problem103 solution = new Problem103();

    @Test
    public void example1() {
        TreeNode root = TreeNodes.treeOf();
        assert Objects.equals(solution.zigzagLevelOrder(root),
            Arrays.asList());
    }

    @Test
    public void example2() {
        TreeNode root = TreeNodes.treeOf(3,9,20,null,null,15,7);
        assert Objects.equals(solution.zigzagLevelOrder(root),
            Arrays.asList(
                Arrays.asList(3),
                Arrays.asList(20,9),
                Arrays.asList(15,7)));
    }

    @Test
    public void example3() {
        TreeNode root = TreeNodes.treeOf(1,2,3,4,null,null,5);
        assert Objects.equals(solution.zigzagLevelOrder(root),
            Arrays.asList(
                Arrays.asList(1),
                Arrays.asList(3,2),
                Arrays.asList(4,5)));
    }

    @Test
    public void example4() {
        assertThat(solution.zigzagLevelOrder(treeOf(0, 2, 4, 1, null, 3, -1, 5, 1, null, 6, null, 8)), is(
            asList(
                singletonList(0),
                asList(4, 2),
                asList(1, 3, -1),
                asList(8, 6, 1, 5))));
    }
}
